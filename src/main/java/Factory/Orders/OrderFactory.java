package Factory.Orders;

import Domain.Orders.Order;

public class OrderFactory {

    public static Order getOder(String orderNumber) {
        return new Order.Builder().orderNumber(orderNumber)
                .build();
    }
}
