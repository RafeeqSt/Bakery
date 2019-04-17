package Factory;

import Domain.Stock.Ingredient;

public class IngredientFactory {

    public static Ingredient getIngredient(String ingredientType) {
        return new Ingredient.Builder().ingredientType(ingredientType)
                .build();
    }
}
