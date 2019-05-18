package Services.Orders;

import Domain.Orders.OrderItem;
import Services.IService;

import java.util.Set;

public interface OrderItemService extends IService<OrderItem, String> {

    Set<OrderItem> getAll();

}
