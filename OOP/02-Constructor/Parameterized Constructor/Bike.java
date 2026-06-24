public class Bike {
    String brand;
    int speed;

    Bike(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;

        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        Bike b1 = new Bike("Yamaha", 180);
    }
}
