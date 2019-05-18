package Services.Stock;

import Domain.Stock.Inventory;
import Services.IService;

import java.util.Set;

public interface InventoryService extends IService<Inventory, String> {

    Set<Inventory> getAll();

}
