public class Mobile {
    String brand;
    int storage;

    Mobile(String brand, int storage) {
        this.brand = brand;
        this.storage = storage;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Storage: " + storage + "GB");
    }

    public static void main(String[] args) {
        Mobile phone1 = new Mobile("Samsung", 128);
        Mobile phone2 = new Mobile("iPhone", 256);

        phone1.displayInfo();
        phone2.displayInfo();
    }
}
 
    

