import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private final List<Product> productlist = new ArrayList<>();

    public void defaultProduct() {
        productlist.add(new Product(1, "rice", 45.0));
        productlist.add(new Product(2, "ghee", 400.0));
        productlist.add(new Product(3, "sugar", 75.0));
        productlist.add(new Product(4, "salt", 10.0));
        productlist.add(new Product(5, "lemon", 5.0));
        productlist.add(new Product(6, "banana", 15.0));
    }

    public void addProduct(Product product) {
        productlist.add(product);
    }
    public void removeProduct(int index) {
        productlist.remove(index);
    }

    public List<Product> viewProduct() {
        return productlist;
    }

    public Product getItem(int index) {
        return productlist.get(index - 1 );
    }

}
