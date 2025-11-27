package appliance;

public class Main {
    public static void main(String[] args) {
        Appliance wm = new WashingMachine("LG", "Silver");
        Appliance fridge = new Refrigerator("Samsung", "Black");

        wm.turnOn();
        wm.turnOff();
 
        fridge.turnOn();
        fridge.turnOff();
    }
}
