package appliance;
class Refrigerator extends Appliance {
    Refrigerator(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " Refrigerator is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " Refrigerator is now OFF.");
    }
}