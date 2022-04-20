import java.util.Vector;

public class Vehicle {

    private String model;
    private String color;
    private float height;
    private int year;
    private boolean electrical;
    private static Factory factory;


    public Vehicle(String model, String color, float height, int year, boolean electrical, Factory factory)    {
        this.model = model;
        this.color = color;
        this.height = height;
        this.year = year;
        this.electrical = electrical;
        this.factory = factory;
    }

    public Vehicle() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isElectrical() {
        return electrical;
    }

    public void setElectrical(boolean electrical) {
        this.electrical = electrical;
    }

    public static Factory getFactory() {
        return factory;
    }

    public static void setFactory(Factory factory) {
        Vehicle.factory = factory;
    }

    @Override
    public String toString() {

        return "Vehicle{ " +
                "model = '" + model + '\'' +
                ", color = '" + color + '\'' +
                ", height = " + height +
                ", year = " + year +
                ", electrical = " + electrical +
                ", factory = " + factory +
                '}';

    }

}
