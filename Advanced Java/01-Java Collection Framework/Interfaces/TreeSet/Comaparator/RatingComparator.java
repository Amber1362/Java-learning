import java.util.Comparator;

public class RatingComparator implements Comparator<Product> {
    
    @Override
    public int compare(Product p1, Product p2) {
        
        return Double.compare(p1.ratings, p2.ratings);
    }
}
