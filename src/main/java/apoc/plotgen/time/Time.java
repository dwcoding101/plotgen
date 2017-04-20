package apoc.plotgen.time;

import apoc.plotgen.gender.GenderGenerator;
import apoc.plotgen.names.NameGenerator;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.logging.Log;
import org.neo4j.procedure.*;

import java.util.UUID;

/**
 * Created by Daniel on 20/04/2017.
 */
public class Time {
    @Context
    public GraphDatabaseService db;

    @Context
    public Log log;

    @Procedure(name = "apoc.plotgen.npc.CreateTime", mode = Mode.WRITE)
    @Description( "apoc.plotgen.npc.CreateNPC - create a new NPC" )
    public void CreateTime() {

        NameGenerator nameGenerator = new NameGenerator();
        GenderGenerator genderGenerator = new GenderGenerator();

        String uuid = uuid();

        String query = "MERGE (a:TIME{uuid:'"+uuid+"',start:'0', current:'0', dayLength:'86164.1', daysInYear:'365'})";

        Result execute = db.execute(query);
    }

    @Procedure(name = "apoc.plotgen.npc.SetDayLength", mode = Mode.WRITE)
    @Description( "apoc.plotgen.npc.SetDayLength - sets the length of the world day in seconds" )
    public void SetDayLength(@Name("Second") long second) {

        String query = "MATCH (a:TIME)) WITH a SET a.dayLength = '"+ second +"'";

        Result execute = db.execute(query);
    }

    @Procedure(name = "apoc.plotgen.npc.SetDayInYear", mode = Mode.WRITE)
    @Description( "apoc.plotgen.npc.SetDayInYear - sets the number of the world days in the worlds")
    public void SetDayInYear(@Name("dayInYear") long days) {

        String query = "MATCH (a:TIME)) WITH a SET a.daysInYear = '"+ days +"'";

        Result execute = db.execute(query);
    }

    @Procedure(name = "apoc.plotgen.npc.AdvanceADay", mode = Mode.WRITE)
    @Description( "apoc.plotgen.npc.AdvanceADay - Advance Time one day")
    public void AdvanceADay() {

        // Get day length in seconds
        String query = "MATCH (a:TIME)) WITH RETURN a.dayLength";

        Result execute = db.execute(query);

        log.info(execute.resultAsString());
    }




    @UserFunction
    @Description("apoc.create.uuid() - creates an UUID")
    public String uuid() {
        return UUID.randomUUID().toString();
    }
}
