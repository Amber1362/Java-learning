public class Bus extends Transport {
    Bus(String company) {
        super(company);
    }
    void move() {
        System.out.println("Bus is transporting passengers.");
    }
}
