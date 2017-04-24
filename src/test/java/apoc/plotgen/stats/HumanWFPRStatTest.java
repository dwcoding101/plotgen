package apoc.plotgen.stats;

/**
 * Created by Daniel on 24/04/2017.
 */
public class HumanWFPRStatTest {
    public static void main(String[] args) {
        HumanWFRPStats humanWFRPStats = new HumanWFRPStats();

        humanWFRPStats.rollStats();

        System.out.println(humanWFRPStats.toString());
    }
}
