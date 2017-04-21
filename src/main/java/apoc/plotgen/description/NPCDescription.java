package apoc.plotgen.description;

/**
 * Created by Daniel on 21/04/2017.
 */
public class NPCDescription {
    private double age;

    void setAge(long current, long dob,long dayLenght, long daysInYear ) {
        age = (current - dob)/(dayLenght*daysInYear);
    }
}
