package Factory;

import Domain.Item;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class ItemFactoryTest {


    @Test
    public void getCompany() {
        String name = "Chocolate";
        int price = 10;
        Item item = ItemFactory.getCompany(name,price);
        assertNotNull(item.getName(),item.getPrice());
    }
}