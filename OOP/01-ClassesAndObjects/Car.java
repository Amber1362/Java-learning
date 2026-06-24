public class Car {
    String brand;
    int price; 

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "BMW";
        c1.price = 5000000;

        c2.brand = "Audi";
        c2.price = 4500000;

        c1.displayInfo();
        c2.displayInfo();
    }
}
