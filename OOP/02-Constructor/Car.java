public class Car {
    String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 5000000);
        Car car2 = new Car("Audi", 4500000);

        car1.displayInfo();
        car2.displayInfo();
    }
}
