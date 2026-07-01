public class Television extends Appliance {

    Television(String brand) {
        super(brand);
    }
    
    void turnOn() {
        System.out.println("Television is now ON.");
    }
}
