package apoc.plotgen;

import apoc.plotgen.gender.GenderGenerator;
import apoc.plotgen.names.NameGenerator;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.logging.Log;
import org.neo4j.procedure.*;

/**
 * Created by Daniel on 27/04/2017.
 */
public class GenerateAll {
    @Context
    public GraphDatabaseService db;

    @Context
    public Log log;

    @Procedure(name = "apoc.plotgen.GenerateAllNPC", mode = Mode.WRITE)
    @Description( "apoc.plotgen.GenerateAllNPC - create a new NPC" )
    public void generateAllNPCs(@Name("Count") long count) {



        String query = "CALL apoc.plotgen.npc.CreateNPC("+count+")";
        Result execute = db.execute(query);

        query = "CALL apoc.plotgen.time.CreateTime()";
        execute = db.execute(query);

        query = "CALL apoc.plotgen.npc.SetStartingDOB()";
        execute = db.execute(query);

        query = "CALL apoc.plotgen.time.setAllAges()";
        execute = db.execute(query);

        query = "CALL apoc.plotgen.relationships.KnownRandom()";
        execute = db.execute(query);
    }
}
