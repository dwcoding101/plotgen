package apoc.plotgen.npc;

import apoc.plotgen.description.DescriptionGenerator;
import apoc.plotgen.gender.GenderGenerator;
import apoc.plotgen.names.NameGenerator;
import apoc.plotgen.stats.HumanWFRPStats;
import apoc.plotgen.stats.WFRPStats;
import apoc.result.GraphResult;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Result;
import org.neo4j.logging.Log;
import org.neo4j.procedure.*;

import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 * Created by Daniel on 19/04/2017.
 */
public class NpcGenerator {

    @Context
    public GraphDatabaseService db;

    @Context
    public Log log;


    @Procedure(name = "apoc.plotgen.npc.CreateNPC", mode = Mode.WRITE)
    @Description( "apoc.plotgen.npc.CreateNPC - create a new NPC" )
    public void CreateNPC(@Name("Count") long count) {

        NameGenerator nameGenerator = new NameGenerator();
        GenderGenerator genderGenerator = new GenderGenerator();
        DescriptionGenerator descriptionGenerator = new DescriptionGenerator();
        HumanWFRPStats humanWFRPStats = new HumanWFRPStats();

        for(int i = 0; i < count; i++) {
            String uuid = uuid();
            String gender = genderGenerator.gender();
            String firstName = "";
            if (gender.equals("Female")) {
                firstName = nameGenerator.humanFemale();
            } else {
                firstName = nameGenerator.humanMale();
            }
            String surname = nameGenerator.humanSurnameP1() + nameGenerator.humanSurnameP2();

            String query = "CALL apoc.create.node(['NPC'], {uuid:'" + uuid + "'" +
                    ", firstName:'" + firstName + "'" +
                    ", surname:'" + surname + "'" +
                    ", gender:'" + gender + "'" +
                    "})";

            Result execute = db.execute(query);

            query = "CALL apoc.plotgen.description.CreateDescription('" + uuid + "')";

            execute = db.execute(query);

            humanWFRPStats.rollStats();

            String statUuid = uuid();
            query = "MERGE " + wFRPStat(humanWFRPStats, statUuid );

            execute = db.execute(query);

            query = "MATCH (a:NPC),(b:STATS) WHERE b.uuid='"+ statUuid +"' AND a.uuid='"+ uuid +"' WITH a,b CREATE(a)-[l:STATS_OF{type:'wfrp'}]->(b)";

            execute = db.execute(query);

          //  log.info(humanWFRPStats.toString());

        }
    }

    private String wFRPStat(WFRPStats stats, String uuid) {
        String ret = "";

        ret = "(s:STATS{uuid:'" + uuid+ "', " +
                        "ws:'" + stats.getWs() + "', " +
                        "bs:'" + stats.getBs() + "', " +
                        "s:'" + stats.getS() + "', " +
                        "t:'" + stats.getT() + "', " +
                        "ag:'" + stats.getAg() + "', " +
                        "int:'" + stats.getInt() + "', " +
                        "wp:'" + stats.getWp() + "', " +
                        "fel:'" + stats.getFel() + "', " +
                        "a:'" + stats.getA() + "', " +
                        "w:'" + stats.getW() + "', " +
                        "sb:'" + stats.getSb() + "', " +
                        "tb:'" + stats.getTb() + "', " +
                        "m:'" + stats.getM() + "', " +
                        "mag:'" + stats.getMag() + "', " +
                        "ip:'" + stats.getIp() + "', " +
                        "fp:'" + stats.getFp() + "'}) ";


        return ret;
    }

    @Procedure(name = "apoc.plotgen.npc.SetStartingDOB", mode = Mode.WRITE)
    @Description( "apoc.plotgen.npc.SetStartingDOB - Set Character Date of Birth" )
    public void SetStartingDOB() {
        //Set all characters Date of Birth

        NameGenerator nameGenerator = new NameGenerator();
        GenderGenerator genderGenerator = new GenderGenerator();


        long min = 503198344L;
        long max = 1132196274L;
        Random r = new Random();

        ThreadLocalRandom.current().nextLong(min,max);
      //  long number = min+((long)(r.nextDouble()*(max-min)));

        //Get all NPC
        //MATCH (n:NPC) WHERE NOT EXISTS(n.dob) RETURN n

        //Get the current time
        String query = "MATCH (a:TIME) RETURN a.current AS dayLength";
        long current = 0;
        try ( Result result = db.execute( query ) )
        {
            while ( result.hasNext() )
            {
                Map<String, Object> row = result.next();
                for ( String key : result.columns() )
                {
                    current = Long.parseLong((String) row.get(key));

                }
            }
        }



        query = "MATCH (n:NPC) WHERE NOT EXISTS(n.dob) RETURN n";
        try ( Result result = db.execute( query ) )
        {
            while ( result.hasNext() )
            {
                Map<String, Object> row = result.next();
            //    String uuid = (String) row.get("uuid");
                long number = ThreadLocalRandom.current().nextLong(min,max);
                long dob = current - number;
                String uuid ="Not Set";
                for ( String key : result.columns() )
                {

                    Node node = (Node)row.get(key);
                    uuid = node.getProperty(key="uuid").toString();
                    log.info(uuid);
                }

                log.info("DOB := " + dob + " uuid := " +uuid );
                String querry2 = "MATCH (a:NPC) WHERE a.uuid='"+uuid+"' SET a.dob='"+dob+"'";
                db.execute(querry2);

            }
        }
    }



    @UserFunction
    @Description("apoc.create.uuid() - creates an UUID")
    public String uuid() {
        return UUID.randomUUID().toString();
    }
}
