import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        TreeSet<Laptop> laptops = new TreeSet<>();

        laptops.add(new Laptop("Dell", 65000));
        laptops.add(new Laptop("HP", 55000));
        laptops.add(new Laptop("Lenovo", 60000));
        laptops.add(new Laptop("Asus", 70000));
        laptops.add(new Laptop("Acer", 55000));

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}
