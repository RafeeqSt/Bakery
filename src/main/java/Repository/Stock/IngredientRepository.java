package Repository.Stock;

import Domain.Stock.Ingredient;
import Repository.IRepository;

import java.util.Set;

public interface IngredientRepository extends IRepository<Ingredient, String> {

    Set<Ingredient> getAll();

}
