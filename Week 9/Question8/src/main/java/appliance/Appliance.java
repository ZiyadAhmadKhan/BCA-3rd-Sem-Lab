package appliance;
public abstract class Appliance {
    protected String brand;
    protected String color;
    Appliance(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    abstract protected void turnOn();
    abstract protected void turnOff();
}