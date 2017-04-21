package apoc.plotgen.description;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.logging.Log;
import org.neo4j.procedure.*;

import java.util.UUID;

/**
 * Created by Daniel on 21/04/2017.
 */
public class DescriptionGenerator {


    @Context
    public GraphDatabaseService db;

  //  @Context
  //  public Log log;

    @Procedure(name = "apoc.plotgen.description.CreateDescription", mode = Mode.WRITE)
    @Description( "apoc.plotgen.description.CreateDescription(NPCuuid) - Advance Time one day")
    public void CreateDescription(@Name("NPCuuid") String NPCuuid) {


        // Create NPCDescription Node.
        String uuid = uuid();

        String query = "MATCH (a:NPC)\n" +
                "WHERE a.uuid='" + NPCuuid +"'\n" +
                "WITH a\n" +
                "MERGE (a)-[l:LOOKS_LIKE]->(b:DESCRIPTION{uuid:'"+ uuid +"'}) RETURN a,l,b";

        try ( Result result = db.execute( query ) ) {

        }

    }

    public String uuid() {
        return UUID.randomUUID().toString();
    }
}
