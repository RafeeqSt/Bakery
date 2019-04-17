package Factory;

import Domain.Stock.Inventory;

public class InventoryFactory {

    public static Inventory getInventory(String inventoryType) {
        return new Inventory.Builder().inventoryType(inventoryType)
                .build();
    }
}
