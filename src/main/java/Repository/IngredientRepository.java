package Repository;

import Domain.Stock.Ingredient;

import java.util.Set;

public interface IngredientRepository extends IRepository<Ingredient, String> {

    Set<Ingredient> getAll();

}
