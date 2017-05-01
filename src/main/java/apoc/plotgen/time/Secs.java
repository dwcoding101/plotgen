package apoc.plotgen.time;

/**
 * Created by Daniel on 29/04/2017.
 */
public class Secs {
    double secsInAMin;
    String nameOfSecs;

    public Secs(double secsInAMin, String nameOfSecs) {
        this.secsInAMin = secsInAMin;
        this.nameOfSecs = nameOfSecs;
    }

    public double getSecsInAMin() {
        return secsInAMin;
    }

    public void setSecsInAMin(double secsInAMin) {
        this.secsInAMin = secsInAMin;
    }

    public String getNameOfSecs() {
        return nameOfSecs;
    }

    public void setNameOfSecs(String nameOfSecs) {
        this.nameOfSecs = nameOfSecs;
    }
}
