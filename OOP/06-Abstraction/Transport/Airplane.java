public class Airplane extends Transport {
    Airplane(String company) {
        super(company);
    }
    void move() {
        System.out.println("Airplane is flying in the sky.");
    }
}
