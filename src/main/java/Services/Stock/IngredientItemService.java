package Services.Stock;

import Domain.Stock.IngredientItem;
import Services.IService;

import java.util.Set;

public interface IngredientItemService extends IService<IngredientItem, String> {

    Set<IngredientItem> getAll();

}
