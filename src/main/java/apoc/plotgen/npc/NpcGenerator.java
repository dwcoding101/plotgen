package apoc.plotgen.npc;

import apoc.plotgen.gender.GenderGenerator;
import apoc.plotgen.names.NameGenerator;
import apoc.result.GraphResult;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.procedure.*;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * Created by Daniel on 19/04/2017.
 */
public class NpcGenerator {

    @Context
    public GraphDatabaseService db;

    @Procedure(name = "apoc.plotgen.npc.CreateNPC")
    @Description( "apoc.plotgen.npc.CreateNPC - create a new NPC" )
    public void CreateNPC(@Name("Count") String countString) {
        int count= Integer.parseInt(countString);
        for(int i = 0; i < count; i++) {
            String uuid = uuid();
            String gender = new GenderGenerator().gender();
            String firstName = "";
            if (gender.equals("Female")) {
                firstName = new NameGenerator().humanFemale();
            } else {
                firstName = new NameGenerator().humanMale();
            }
            String surname = new NameGenerator().humanSurnameP1() + new NameGenerator().humanSurnameP2();

            String query = "CALL apoc.create.node(['NPC'], {uuid:" + uuid +
                    ", firstName:'" + firstName + "'" +
                    ", surname:'" + surname + "'" +
                    ", gender:'" + gender + "'" +
                    "})";

            Result execute = db.execute(query);
        }
    }



    @UserFunction
    @Description("apoc.create.uuid() - creates an UUID")
    public String uuid() {
        return UUID.randomUUID().toString();
    }
}
