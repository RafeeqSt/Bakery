package Repository.Stock;

import Domain.Stock.Inventory;
import Repository.IRepository;

import java.util.Set;

public interface InventoryRepository extends IRepository<Inventory, String> {

    Set<Inventory> getAll();

}
