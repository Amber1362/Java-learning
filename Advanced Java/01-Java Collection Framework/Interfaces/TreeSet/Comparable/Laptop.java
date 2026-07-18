import java.util.TreeSet;

public class Laptop implements Comparable<Laptop> {
    
    String name;
    int price;

    Laptop(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Laptop other) {
        return this.price - other.price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}
