package Repository;

import Domain.Orders.Order;

import java.util.Set;

public interface OrderRepository extends IRepository<Order, String> {

    Set<Order> getAll();

}
