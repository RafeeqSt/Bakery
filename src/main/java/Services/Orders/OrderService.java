package Services.Orders;

import Domain.Orders.Order;
import Services.IService;

import java.util.Set;

public interface OrderService extends IService<Order, String> {

    Set<Order> getAll();

}
