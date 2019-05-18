package Services.Stock.Impl;

import Domain.Stock.IngredientItem;
import Repository.Stock.Impl.IngredientItemRepositoryImpl;
import Repository.Stock.IngredientItemRepository;
import Services.Stock.IngredientItemService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class IngredientItemServiceImpl implements IngredientItemService {

    private static IngredientItemServiceImpl service = null;
    private IngredientItemRepository repository;

    private IngredientItemServiceImpl(){
        this.repository = IngredientItemRepositoryImpl.getRepository();
    }

    public static IngredientItemServiceImpl getService(){
        if (service == null) service = new IngredientItemServiceImpl();
        return service;
    }

    @Override
    public IngredientItem create(IngredientItem equipment){
        return this.repository.create(equipment);
    }

    @Override
    public IngredientItem update(IngredientItem equipment) {
        return this.repository.update(equipment);
    }

    @Override
    public IngredientItem read(String equipID){
        return this.repository.read(equipID);
    }

    @Override
    public void delete(String equipID) {
        this.repository.delete(equipID);
    }

    @Override
    public Set<IngredientItem> getAll(){
        return this.repository.getAll();
    }

}
