public class Mobile {
    String brand;
    int storage;

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Storage: " + storage + "GB");
    }

    public static void main(String[] args) {
        Mobile phone1 = new Mobile();
        Mobile phone2 = new Mobile();

        phone1.brand = "Samsung";
        phone1.storage = 128;

        phone2.brand = "iPhone";
        phone2.storage = 256;

        phone1.displayInfo();
        phone2.displayInfo();
    }
}
