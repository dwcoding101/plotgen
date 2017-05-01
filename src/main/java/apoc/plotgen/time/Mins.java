package apoc.plotgen.time;

/**
 * Created by Daniel on 29/04/2017.
 */
public class Mins {
    double numberOfMinsInADay;
    String nameOfMins;

    public Mins(double numberOfMinsInADay) {
        this.numberOfMinsInADay = numberOfMinsInADay;
    }

    public double getNumberOfMinsInADay() {
        return numberOfMinsInADay;
    }

    public void setNumberOfMinsInADay(double numberOfMinsInADay) {
        this.numberOfMinsInADay = numberOfMinsInADay;
    }

    public String getNameOfMins() {
        return nameOfMins;
    }

    public void setNameOfMins(String nameOfMins) {
        this.nameOfMins = nameOfMins;
    }
}
