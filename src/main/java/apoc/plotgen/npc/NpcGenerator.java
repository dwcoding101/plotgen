package apoc.plotgen.npc;

import apoc.plotgen.gender.GenderGenerator;
import apoc.plotgen.names.NameGenerator;
import apoc.result.GraphResult;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.procedure.*;

import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Created by Daniel on 19/04/2017.
 */
public class NpcGenerator {

    @Context
    public GraphDatabaseService db;

    @Procedure(name = "apoc.plotgen.npc.CreateNPC", mode = Mode.WRITE)
    @Description( "apoc.plotgen.npc.CreateNPC - create a new NPC" )
    public void CreateNPC(@Name("Count") long count) {

        NameGenerator nameGenerator = new NameGenerator();
        GenderGenerator genderGenerator = new GenderGenerator();



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
        }
    }

    @Procedure(name = "apoc.plotgen.npc.SetStartingDOB", mode = Mode.WRITE)
    @Description( "apoc.plotgen.npc.SetStartingDOB - Set Character Date of Birth" )
    public void SetStartingDOB(@Name("Count") long count) {
        //Set all characters Date of Birth

        NameGenerator nameGenerator = new NameGenerator();
        GenderGenerator genderGenerator = new GenderGenerator();


        long min = 503198344L;
        long max = 1132196274L;
        Random r = new Random();
      //  long number = min+((long)(r.nextDouble()*(max-min)));

        //Get all NPC
        //MATCH (n:NPC) WHERE NOT EXISTS(n.dob) RETURN n

        //Get the current time
        String query = "MATCH (a:TIME) RETURN a.current AS dayLength";
        double current = 0;
        try ( Result result = db.execute( query ) )
        {
            while ( result.hasNext() )
            {
                Map<String, Object> row = result.next();
                for ( String key : result.columns() )
                {
                    current = Double.parseDouble((String) row.get(key));

                }
            }
        }



        query = "MATCH (n:NPC) WHERE NOT EXISTS(n.dob) RETURN n";
        try ( Result result = db.execute( query ) )
        {
            while ( result.hasNext() )
            {
                Map<String, Object> row = result.next();
                String uuid = (String)row.get("uuid");
                for ( String key : result.columns() )
                {
                    long number = min+((long)(r.nextDouble()*(max-min)));
                    double dob = current - number;
                    String querry2 = "MATCH (a:NPC) WHERE a.uuid='"+uuid+"' SET a.dob='"+dob+"'";
                    db.execute(querry2);
                }
            }
        }
    }



    @UserFunction
    @Description("apoc.create.uuid() - creates an UUID")
    public String uuid() {
        return UUID.randomUUID().toString();
    }
}
