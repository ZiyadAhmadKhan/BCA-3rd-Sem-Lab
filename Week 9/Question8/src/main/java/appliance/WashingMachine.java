package appliance;

class WashingMachine extends Appliance {
    WashingMachine(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " Washing Machine is now ON. ");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " Washing Machine is now OFF.");
    }
}
