package opencart.Service.ServiceInt;

import opencart.Model.Order;
import opencart.Model.Product;

import java.util.Collection;

public interface OrderService {
    Collection<Order> listAllOrder();
//    void removeOrder(Order order);
}
