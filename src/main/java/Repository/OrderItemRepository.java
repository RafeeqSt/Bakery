package Repository;

import Domain.Orders.OrderItem;

import java.util.Set;

public interface OrderItemRepository extends IRepository<OrderItem, String> {

    Set<OrderItem> getAll();

}
