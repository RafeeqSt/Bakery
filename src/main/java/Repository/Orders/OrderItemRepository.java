package Repository.Orders;

import Domain.Orders.OrderItem;
import Repository.IRepository;

import java.util.Set;

public interface OrderItemRepository extends IRepository<OrderItem, String> {

    Set<OrderItem> getAll();

}
