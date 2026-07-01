public class WashingMachine extends Appliance {

    WashingMachine(String brand) {
        super(brand);
    }

    void turnOn() {
        System.out.println("Washing Machine is now ON.");
    }
}
