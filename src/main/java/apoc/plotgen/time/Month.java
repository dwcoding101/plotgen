package apoc.plotgen.time;

/**
 * Created by Daniel on 29/04/2017.
 */
public class Month {
    int order;
    String nameOfMonth;
    int dayInTheMonth;

    public Month(int order, String nameOfMonth, int daysInTheMonth) {
        this.order = order;
        this.nameOfMonth = nameOfMonth;
        this.dayInTheMonth = daysInTheMonth;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public void setNameOfMonth(String nameOfMonth) {
        this.nameOfMonth = nameOfMonth;
    }

    public int getDayInTheMonth() {
        return dayInTheMonth;
    }

    public void setDayInTheMonth(int dayInTheMonth) {
        this.dayInTheMonth = dayInTheMonth;
    }
}
