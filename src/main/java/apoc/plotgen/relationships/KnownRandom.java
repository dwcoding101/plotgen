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

        ArrayList<String> npcList = new ArrayList<String>();

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
                        npcList.add(node.getProperty("uuid").toString());

                    }
                }
            }
        }

        ArrayList KnowableNpcList;
        List KnowNPCList;
        for (int currentPosition = 0; currentPosition < npcList.size(); currentPosition++) {
            String workingUuid = npcList.get(currentPosition).toString();
            KnowableNpcList = npcList;
            KnowableNpcList.remove(currentPosition);
            numberOfPeopleKnow = (int) Dice.roll("1D6");
            KnowNPCList = pickNRandom(KnowableNpcList,numberOfPeopleKnow);

            // add in the relationships
            KnowableNpcList.forEach((knownUuid)->{
                String knowQuerry = "MATCH (a:NPC),(b:NPC) WHERE a.uuid='"+workingUuid+"' AND b.uuid='"+knownUuid+"' WITH a,b MERGE (a)-[:KNOWS_OF]->(b) WITH a,b MERGE (b)-[:KNOWS_OF]->(a)";
                try ( Result result = db.execute( knowQuerry ) ) {

                }
            });

        }



    }

    public static List<String> pickNRandom(List<String> lst, int n) {
        List<String> copy = new LinkedList<String>(lst);
        Collections.shuffle(copy);
        return copy.subList(0, n);
    }

}
