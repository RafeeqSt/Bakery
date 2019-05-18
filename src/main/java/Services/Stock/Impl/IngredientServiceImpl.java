package Services.Stock.Impl;

import Domain.Stock.Ingredient;
import Repository.Stock.Impl.IngredientRepositoryImpl;
import Repository.Stock.IngredientRepository;
import Services.Stock.IngredientService;

import java.util.HashSet;
import java.util.Set;

public class IngredientServiceImpl implements IngredientService {

    private static IngredientServiceImpl service = null;
    private IngredientRepository repository;

    private IngredientServiceImpl(){
        this.repository = IngredientRepositoryImpl.getRepository();
    }

    public static IngredientServiceImpl getService(){
        if (service == null) service = new IngredientServiceImpl();
        return service;
    }

    @Override
    public Ingredient create(Ingredient ingredient){
        return this.repository.create(ingredient);
    }

    @Override
    public Ingredient update(Ingredient ingredient) {
        return this.repository.update(ingredient);
    }

    @Override
    public Ingredient read(String ingredientType){
        return this.repository.read(ingredientType);
    }

    @Override
    public void delete(String ingredientType) {
        this.repository.delete(ingredientType);
    }

    @Override
    public Set<Ingredient> getAll(){
        return this.repository.getAll();
    }

}
