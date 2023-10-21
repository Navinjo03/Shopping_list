// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProductList list = new ProductList();
        list.defaultProduct();
        System.out.println(list.viewProduct());

        System.out.println("Enter the item for add to cart");
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(list.getItem(1));
        cart.addItem(list.getItem(2));
        cart.addItem(list.getItem(4));
        cart.addItem(list.getItem(6));

        System.out.println(cart.viewCart());
        System.out.println(cart.totalPrice());

    }
}