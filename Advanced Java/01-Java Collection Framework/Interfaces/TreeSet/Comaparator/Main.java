import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        TreeSet<Product> productName = new TreeSet<>(new NameComparator());
        TreeSet<Product> productPrice = new TreeSet<>(new PriceComparator());
        TreeSet<Product> productRatings = new TreeSet<>(new RatingComparator());
        TreeSet<Product> productDiscount = new TreeSet<>(new DiscountComparator());

        Product p1 = new Product("iPhone", 80000, 4.8, 10);
        Product p2 = new Product("Samsung", 70000, 4.6, 20);
        Product p3 = new Product("OnePlus", 50000, 4.5, 15);
        Product p4 = new Product("Realme", 25000, 4.2, 25);
        Product p5 = new Product("Nothing", 40000, 4.4, 18);

        List<Product> products = new ArrayList<>();

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        productName.addAll(products);
        productPrice.addAll(products);
        productRatings.addAll(products);
        productDiscount.addAll(products);

        System.out.println("Product sorted by Name: ");
        for (Product product : productName) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("Product sorted by Price: ");
        for (Product product : productPrice) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("Product sorted by Ratings: ");
        for (Product product : productRatings) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("Product sorted by Discount: ");
        for (Product product : productDiscount) {
            System.out.println(product);
        }
    }
}
