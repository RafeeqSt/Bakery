package Factory;

import Domain.Stock.Inventory;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryFactoryTest {

    @Test
    public void getInventory() {
        String inventoryType = "Ingredient";
        Inventory inventory = InventoryFactory.getInventory(inventoryType);
        assertNotNull(inventory.getInventoryTypeType());
    }
}