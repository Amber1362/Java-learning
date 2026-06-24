public class Product {
    String name;
    int price;
    int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 2);
        Product p2 = new Product("Mouse", 1000, 5);

        p1.displayInfo();
        p2.displayInfo();
    }
}
