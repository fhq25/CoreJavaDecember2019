package j.fundamentals;

public class Bike {

    private String type;
    private double cost;

    private static int count = 0;

    public Bike(String type, double cost) {
        this.type = type;
        this.cost = cost;
        count++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static int getCount() {
        return count;
    }
}
