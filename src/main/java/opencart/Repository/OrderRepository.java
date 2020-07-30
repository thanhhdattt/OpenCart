package opencart.Repository;

import opencart.Model.Order;
import opencart.Model.Product;
import org.aspectj.weaver.ast.Or;

import java.util.Collection;

public interface OrderRepository {
    Order findOrderByID(int ID);
    void save(Order order);
    void deleteById(Integer Id);
    Collection<Order> listAllOrders();
//    void add(Order order);
}
