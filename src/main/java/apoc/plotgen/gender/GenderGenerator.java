package apoc.plotgen.gender;

import org.neo4j.procedure.Description;
import org.neo4j.procedure.UserFunction;

import java.util.Random;

/**
 * Created by Daniel on 19/04/2017.
 */
public class GenderGenerator {
    @UserFunction(name = "apoc.plotgen.gender.gender")
    @Description("apoc.plotgen.gender.gender()")
    public String gender() {
        String ret;
        int randNumber;

        Random random = new Random();
        int min = 1;
        int max = 2;
        randNumber = random.nextInt(max - min + 1) + min;
        switch (randNumber) {
            case 1:
                ret = "Female";
                break;
            case 2:
                ret = "Male";
                break;
            default:
                ret = "Not Set";
                break;
        }

        return ret;
    }
}
