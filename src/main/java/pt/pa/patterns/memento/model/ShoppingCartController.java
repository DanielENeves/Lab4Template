package pt.pa.patterns.memento.model;

import java.util.Collection;
import java.util.Date;

public class ShoppingCartController {
    private ShoppingCart cart;

    public ShoppingCartController() {
        cart = new ShoppingCart();

    }

    public void addProduct(String name, double cost) {

        Product p = new Product(name, cost);
        cart.addProduct(p);
    }

    public void reset() {

        cart.reset();
    }

    public void removeProduct(String name) {
        for (Product p : cart.getProducts())
            if (p.getName().equals(name)) {

                cart.removeProduct(p);
                return;
            }
        return;
    }


    public void undo() throws NoMementoException {
        //complete
    }

    public Collection<Product> getProducts() {
        return cart.getProducts();
    }

    public String showAll() {
        String str = cart.toString() + "\nTotal price:" + cart.getTotal();
        return str;
    }
}
