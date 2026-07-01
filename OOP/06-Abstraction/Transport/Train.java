public class Train extends Transport {
    Train(String company) {
         super(company);
    }
    void move() {
        System.out.println("Train is running on railway tracks.");
    }
}
