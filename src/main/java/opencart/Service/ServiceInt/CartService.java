package opencart.Service.ServiceInt;

import opencart.Model.Cart;
import opencart.Model.Product;

import java.util.Collection;

public interface CartService {
    Collection<Cart> findCartByName (String name);
    Cart findCartByID(Integer ID);
    Double checkOutCart();
    Collection<Product> showProductByCart();
    Collection<Product> addProductToCart(Integer productID, Integer customerID);
    Collection<Product> removeProductFromCart(Product product);
}