package apoc.convert;

import java.util.*;
import java.io.*;
import java.util.stream.*;

import com.jayway.jsonpath.JsonPath;
import org.neo4j.procedure.Description;
import apoc.result.ListResult;
import apoc.result.MapResult;
import apoc.result.ObjectResult;
import apoc.result.StringResult;
import apoc.util.JsonUtil;
import apoc.util.Util;
import org.neo4j.graphdb.*;
import org.neo4j.procedure.*;

public class Json {

    @Context
    public org.neo4j.graphdb.GraphDatabaseService db;

    @UserFunction("apoc.json.path")
    @Description("apoc.json.path('{json}','json-path')")
    public Object path(@Name("json") String json, @Name(value = "path",defaultValue = "$") String path) {
        return JsonUtil.parse(json,path,Object.class);
    }
    @UserFunction("apoc.convert.toJson")
    @Description("apoc.convert.toJson([1,2,3]) or toJson({a:42,b:\"foo\",c:[1,2,3]})")
    public String toJson(@Name("value") Object value) {
        try {
            return JsonUtil.OBJECT_MAPPER.writeValueAsString(value);
        } catch (IOException e) {
            throw new RuntimeException("Can't convert " + value + " to json", e);
        }
    }

    @Procedure(mode = Mode.WRITE) // ,name = "apoc.json.setProperty")
    @Description("apoc.convert.setJsonProperty(node,key,complexValue) - sets value serialized to JSON as property with the given name on the node")
    public void setJsonProperty(@Name("node") Node node, @Name("key") String key, @Name("value") Object value) {
        try {
            node.setProperty(key, JsonUtil.OBJECT_MAPPER.writeValueAsString(value));
        } catch (IOException e) {
            throw new RuntimeException("Can't convert " + value + " to json", e);
        }
    }

    @UserFunction// ("apoc.json.getJsonProperty")
    @Description("apoc.convert.getJsonProperty(node,key[,'json-path']) - converts serialized JSON in property back to original object")
    public Object getJsonProperty(@Name("node") Node node, @Name("key") String key,@Name(value = "path",defaultValue = "") String path) {
        String value = (String) node.getProperty(key, null);
        return JsonUtil.parse(value, path, Object.class);
    }

    @UserFunction// ("apoc.json.getJsonPropertyMap")
    @Description("apoc.convert.getJsonPropertyMap(node,key[,'json-path']) - converts serialized JSON in property back to map")
    public Map<String,Object> getJsonPropertyMap(@Name("node") Node node, @Name("key") String key,@Name(value = "path",defaultValue = "") String path) {
        String value = (String) node.getProperty(key, null);
        return JsonUtil.parse(value, path, Map.class);
    }

    @UserFunction
    @Description("apoc.convert.fromJsonMap('{\"a\":42,\"b\":\"foo\",\"c\":[1,2,3]}'[,'json-path'])")
    public Map<String,Object> fromJsonMap(@Name("map") String value,@Name(value = "path",defaultValue = "") String path) {
        return JsonUtil.parse(value, path, Map.class);
    }

    @UserFunction
    @Description("apoc.convert.fromJsonList('[1,2,3]'[,'json-path'])")
    public List<Object> fromJsonList(@Name("list") String value, @Name(value = "path",defaultValue = "") String path) {
        return JsonUtil.parse(value, path, List.class);
    }

    @Procedure("apoc.convert.toTree")
    @Description("apoc.convert.toTree([paths]) creates a stream of nested documents representing the at least one root of these paths")
    // todo optinally provide root node
    public Stream<MapResult> toTree(@Name("paths") List<Path> paths) {
        Map<Long, Map<String, Object>> maps = new HashMap<>(paths.size() * 100);
        for (Path path : paths) {
            Iterator<PropertyContainer> it = path.iterator();
            while (it.hasNext()) {
                Node n = (Node) it.next();
                Map<String, Object> nMap = maps.computeIfAbsent(n.getId(), (id) -> toMap(n));
                if (it.hasNext()) {
                    Relationship r = (Relationship) it.next();
                    Node m = r.getOtherNode(n);
                    Map<String, Object> mMap = maps.computeIfAbsent(m.getId(), (id) -> toMap(m));
                    String typeName = r.getType().name().toLowerCase();
                    mMap = addRelProperties(mMap, typeName, r);
                    // todo take direction into account and create collection into outgoing direction ??
                    // parent-[:HAS_CHILD]->(child) vs. (parent)<-[:PARENT_OF]-(child)
                    if (!nMap.containsKey(typeName)) nMap.put(typeName, new ArrayList<>(16));
                    List list = (List) nMap.get(typeName);
                    if (!list.contains(mMap))
                        list.add(mMap); // todo performance, use set instead and convert to map at the end?
                }
            }
        }
        return paths.stream()
                .map(Path::startNode)
                .map(n -> maps.remove(n.getId()))
                .filter(m -> m != null)
                .map(MapResult::new);
    }

    private Map<String, Object> addRelProperties(Map<String, Object> mMap, String typeName, Relationship r) {
        Map<String, Object> rProps = r.getAllProperties();
        if (rProps.isEmpty()) return mMap;
        String prefix = typeName + ".";
        rProps.forEach((k, v) -> mMap.put(prefix + k, v));
        return mMap;
    }

    private Map<String, Object> toMap(Node n) {
        Map<String, Object> props = n.getAllProperties();
        Map<String, Object> result = new LinkedHashMap<>(props.size() + 2);
        result.put("_id", n.getId());
        result.put("_type", Util.labelString(n));
        result.putAll(props);
        return result;
    }
}
