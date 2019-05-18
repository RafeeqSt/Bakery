package Factory.Stock;

import Domain.Stock.IngredientItem;
import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientItemFactoryTest {

    @Test
    public void getIngredientItem() {
        String itemCode = "Caramel";
        int qtyOnHand = 50;
        IngredientItem ingredientItem = IngredientItemFactory.getIngredientItem(itemCode,qtyOnHand);
        assertNotNull(ingredientItem.getItemCode(),ingredientItem.getQtyOnHand());
    }
}