package Services.Stock;

import Domain.Stock.Ingredient;
import Services.IService;

import java.util.Set;

public interface IngredientService extends IService<Ingredient, String> {

    Set<Ingredient> getAll();

}
