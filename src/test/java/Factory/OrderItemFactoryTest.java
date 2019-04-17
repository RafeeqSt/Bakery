package Factory;

import Domain.Orders.OrderItem;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderItemFactoryTest {

    @Test
    public void getOderItem() {
        String foodType = "Cake";
        OrderItem orderItem = OrderItemFactory.getOderItem(foodType);
        assertNotNull(orderItem.getFoodType());
    }
}