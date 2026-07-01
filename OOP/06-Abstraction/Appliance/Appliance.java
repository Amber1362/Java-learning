public abstract class Appliance {
    String brand;

    Appliance(String brand) {
         this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    abstract void turnOn();
}
