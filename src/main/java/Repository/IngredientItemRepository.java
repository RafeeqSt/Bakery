package Repository;

import Domain.Stock.IngredientItem;

import java.util.Set;

public interface IngredientItemRepository extends IRepository<IngredientItem, String> {

    Set<IngredientItem> getAll();

}
