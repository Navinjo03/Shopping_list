import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public void addItem(Product product) {
        products.add(product);

    }

    public void removeItem(int index) {
        products.remove(index);
    }

    public List<Product> viewCart() {
        return products;
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
