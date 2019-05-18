package Repository.Stock;

import Domain.Stock.IngredientItem;
import Repository.IRepository;

import java.util.Set;

public interface IngredientItemRepository extends IRepository<IngredientItem, String> {

    Set<IngredientItem> getAll();

}
