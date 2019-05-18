package Factory.Orders;

import Domain.Orders.Order;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderFactoryTest {

    @Test
    public void getOder() {
        String orderNumber = "87";
        Order order = OrderFactory.getOder(orderNumber);
        assertNotNull(order.getOrderNumber());
    }
}