package Repository;

import Domain.Stock.Inventory;

import java.util.Set;

public interface InventoryRepository extends IRepository<Inventory, String> {

    Set<Inventory> getAll();

}
