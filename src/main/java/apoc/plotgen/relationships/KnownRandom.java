package apoc.plotgen.relationships;

import apoc.plotgen.random.Dice;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Result;
import org.neo4j.logging.Log;
import org.neo4j.procedure.*;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Daniel on 25/04/2017.
 */
public class KnownRandom {

    @Context
    public GraphDatabaseService db;

    @Context
    public Log log;


    @Procedure(name = "apoc.plotgen.relationships.KnownRandom", mode = Mode.WRITE)
    @Description( "apoc.plotgen.relationships.KnownRandom - create a randon known relationship between NPC" )
    public void KnownRandom() {

        // knows random 1D10 random people

        int numberOfPeopleKnow;

        ArrayList<StringRelationships> npcList = new ArrayList<>();

        String query = "MATCH (a:NPC) RETURN a";
        try ( Result result = db.execute( query ) )
        {
            while ( result.hasNext() )
            {
                Map<String, Object> row = result.next();
                //    String uuid = (String) row.get("uuid");

                int NodeNumder =0;
                for ( String key : result.columns() )
                {
                    Node node = null;
                    Relationship relationship = null;
                    Object obj = row.get(key);
                    if(obj instanceof Node){
                        node = (Node) obj;
                        StringRelationships stringRelationships = new StringRelationships(node.getProperty("uuid").toString(),(int) Dice.roll("1D6"));
                        npcList.add(stringRelationships);

                    }
                }
            }
        }

        ArrayList<StringRelationships> KnowableNpcList;
        List<StringRelationships> knowNPCList;
        boolean cont = true;
        while (cont) {
            StringRelationships workingStringRelationships = npcList.get(0);
            npcList.remove(0);
            numberOfPeopleKnow = workingStringRelationships.getNumberOfRelationships();

            knowNPCList = pickNRandom(npcList, numberOfPeopleKnow);

            // add in the relationships
            knowNPCList.forEach((known) -> {
                String knowQuerry = "MATCH (a:NPC),(b:NPC) WHERE a.uuid='" + workingStringRelationships.getUuid() + "' AND b.uuid='" + known.getUuid() + "' WITH a,b MERGE (a)-[:KNOWS_OF]->(b) WITH a,b MERGE (b)-[:KNOWS_OF]->(a)";
                try (Result result = db.execute(knowQuerry)) {

                }
            });

            npcList = reduceKnow(npcList,knowNPCList);

            if(npcList.isEmpty()){
                cont = false;
            }

        }
    }

    public static ArrayList<StringRelationships> reduceKnow(List<StringRelationships> list, List<StringRelationships> known ) {
        known.forEach((person)->{
            list.forEach((mainPerson)-> {
               if(mainPerson.getUuid().equals(person.getUuid())){
                   mainPerson.numberOfRelationships--;
               }
            });
        });

        // remove all zero relationships
        ArrayList<StringRelationships> ret = new ArrayList<>();
        list.forEach((mainPerson)->{
            if (mainPerson.getNumberOfRelationships() > 1) {
                ret.add(mainPerson);
            }
        });

        return ret;
    }

    public static List<StringRelationships> pickNRandom(List<StringRelationships> lst, int n) {
        List<StringRelationships> copy = new LinkedList<StringRelationships>(lst);
        Collections.shuffle(copy);
        return copy.subList(0, n);
    }

}
