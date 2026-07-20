import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    
    @Override
    public int compare(Product p1, Product p2) {
        
        return Integer.compare(p1.price, p2.price);
    }
}
