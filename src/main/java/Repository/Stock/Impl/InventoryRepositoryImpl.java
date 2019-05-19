package Repository.Stock.Impl;

import Domain.Stock.Inventory;
import Repository.Stock.InventoryRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("InMemory")
public class InventoryRepositoryImpl implements InventoryRepository {

    private static InventoryRepositoryImpl repository = null;
    private Set<Inventory> inventorys;

    private InventoryRepositoryImpl(){
        this.inventorys = new HashSet<>();
    }

    public static InventoryRepositoryImpl getRepository(){
        if (repository == null) repository = new InventoryRepositoryImpl();
        return repository;
    }

    private Inventory findInventory(String inventoryType)
    {
        return this.inventorys.stream()
                .filter(Inventory -> Inventory.getInventoryTypeType().trim()
                        .equals(Inventory)).findAny().orElse(null);
    }

    @Override
    public Set<Inventory> getAll() {
        return this.inventorys;
    }

    @Override
    public Inventory create(Inventory inventory) {
        this.inventorys.add(inventory);
        return inventory;
    }

    @Override
    public Inventory update(Inventory inventory) {
        String id = inventory.getInventoryTypeType();

        Inventory inventoryFind = findInventory(id);

        inventorys.remove(inventoryFind);
        inventorys.add(inventory);

        return null;
    }

    @Override
    public void delete(String s) {
        Inventory inventory = findInventory(s);
        inventorys.remove(inventory);
    }

    @Override
    public Inventory read(String s) {
        Inventory inventory = findInventory(s);
        return inventory == null ? null: inventory;
    }

}
