package Factory;

import Domain.Stock.IngredientItem;

public class IngredientItemFactory {

    public static IngredientItem getIngredientItem(String itemCode, int qtyOnHand) {
        return new IngredientItem.Builder().itemCode(itemCode)
                .qtyOnHand(qtyOnHand)
                .build();
    }
}
