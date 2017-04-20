package apoc.plotgen.time;

import apoc.plotgen.gender.GenderGenerator;
import apoc.plotgen.names.NameGenerator;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.logging.Log;
import org.neo4j.procedure.*;

import java.util.Map;
import java.util.UUID;

/**
 * Created by Daniel on 20/04/2017.
 */
public class Time {
    @Context
    public GraphDatabaseService db;

    @Context
    public Log log;

    @Procedure(name = "apoc.plotgen.time.CreateTime", mode = Mode.WRITE)
    @Description( "apoc.plotgen.npc.CreateNPC - create a new NPC" )
    public void CreateTime() {

        NameGenerator nameGenerator = new NameGenerator();
        GenderGenerator genderGenerator = new GenderGenerator();

        String uuid = uuid();

        String query = "MERGE (a:TIME{uuid:'"+uuid+"',start:'0', current:'0', dayLength:'86164.1', daysInYear:'365'})";

        Result execute = db.execute(query);
    }

    @Procedure(name = "apoc.plotgen.time.SetDayLength", mode = Mode.WRITE)
    @Description( "apoc.plotgen.time.SetDayLength - sets the length of the world day in seconds" )
    public void SetDayLength(@Name("Second") long second) {

        String query = "MATCH (a:TIME)) WITH a SET a.dayLength = '"+ second +"'";

        Result execute = db.execute(query);
    }

    @Procedure(name = "apoc.plotgen.time.SetDayInYear", mode = Mode.WRITE)
    @Description( "apoc.plotgen.time.SetDayInYear - sets the number of the world days in the worlds")
    public void SetDayInYear(@Name("dayInYear") long days) {

        String query = "MATCH (a:TIME)) WITH a SET a.daysInYear = '"+ days +"'";

        Result execute = db.execute(query);
    }

    @Procedure(name = "apoc.plotgen.time.AdvanceADay", mode = Mode.WRITE)
    @Description( "apoc.plotgen.time.AdvanceADay - Advance Time one day")
    public void AdvanceADay() {

        // Get day length in seconds
        String query = "MATCH (a:TIME) RETURN a.dayLength AS dayLength";
        double seconds = 0;
        try ( Result result = db.execute( query ) )
        {
            while ( result.hasNext() )
            {
                Map<String, Object> row = result.next();
                for ( String key : result.columns() )
                {
                    seconds = Double.parseDouble((String) row.get(key));

                }
            }
        }

        //Get the current time
        query = "MATCH (a:TIME) RETURN a.current AS dayLength";
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

        current =current + seconds;
        //Set new current time
        query = "MATCH (a:TIME) SET a.current ='"+ current +"'";
        try ( Result result = db.execute( query ) ){

        }


        log.info("Current Time  := "+ current);
    }




    @UserFunction
    @Description("apoc.create.uuid() - creates an UUID")
    public String uuid() {
        return UUID.randomUUID().toString();
    }
}
