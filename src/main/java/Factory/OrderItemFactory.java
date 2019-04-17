package Factory;

import Domain.Orders.OrderItem;

public class OrderItemFactory {

    public static OrderItem getOderItem(String foodType) {
        return new OrderItem.Builder().foodType(foodType)
                .build();
    }
}
