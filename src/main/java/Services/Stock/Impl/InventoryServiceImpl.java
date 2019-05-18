package Services.Stock.Impl;

import Domain.Stock.Inventory;
import Repository.Stock.Impl.InventoryRepositoryImpl;
import Repository.Stock.InventoryRepository;
import Services.Stock.InventoryService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class InventoryServiceImpl implements InventoryService {

    private static InventoryServiceImpl service = null;
    private InventoryRepository repository;

    private InventoryServiceImpl(){
        this.repository = InventoryRepositoryImpl.getRepository();
    }

    public static InventoryServiceImpl getService(){
        if (service == null) service = new InventoryServiceImpl();
        return service;
    }

    @Override
    public Inventory create(Inventory inventory){
        return this.repository.create(inventory);
    }

    @Override
    public Inventory update(Inventory inventory) {
        return this.repository.update(inventory);
    }

    @Override
    public Inventory read(String inventoryType){
        return this.repository.read(inventoryType);
    }

    @Override
    public void delete(String inventoryType) {
        this.repository.delete(inventoryType);
    }

    @Override
    public Set<Inventory> getAll(){
        return this.repository.getAll();
    }

}
