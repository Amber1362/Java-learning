public class Product {
    String name;
    int price;
    double ratings;
    double discount;

    Product(String name, int price, double ratings, double discount) {
        this.name = name;
        this.price = price;
        this.ratings = ratings;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" + 
        "name = " + name + 
        ", price = " + price + 
        ", ratings = " + ratings + 
        ", discount = " + discount + 
        "}";
    }
}
