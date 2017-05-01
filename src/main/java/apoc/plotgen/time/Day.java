package apoc.plotgen.time;

/**
 * Created by Daniel on 29/04/2017.
 */
public class Day {
    int order;
    String nameOfDay;

    public Day(int order, String nameOfDay) {
        this.order = order;
        this.nameOfDay = nameOfDay;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }

    public void setNameOfDay(String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }
}
