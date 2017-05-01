package apoc.plotgen.time;

/**
 * Created by Daniel on 29/04/2017.
 */
public class Hours {
    double numberOfHoursInADay;
    String nameOfHours;

    public Hours(double numberOfHoursInADay) {
        this.numberOfHoursInADay = numberOfHoursInADay;
    }

    public double getNumberOfHoursInADay() {
        return numberOfHoursInADay;
    }

    public void setNumberOfHoursInADay(double numberOfHoursInADay) {
        this.numberOfHoursInADay = numberOfHoursInADay;
    }

    public String getNameOfHours() {
        return nameOfHours;
    }

    public void setNameOfHours(String nameOfHours) {
        this.nameOfHours = nameOfHours;
    }
}


