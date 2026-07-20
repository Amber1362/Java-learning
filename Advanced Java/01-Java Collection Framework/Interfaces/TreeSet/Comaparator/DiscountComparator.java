import java.util.Comparator;

public class DiscountComparator implements Comparator<Product> {
    
    @Override
    public int compare(Product p1, Product p2) {
        
        return Double.compare(p1.discount, p2.discount);
    }
}
