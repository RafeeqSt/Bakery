package Repository.Orders;

import Domain.Orders.Order;
import Repository.IRepository;

import java.util.Set;

public interface OrderRepository extends IRepository<Order, String> {

    Set<Order> getAll();

}
