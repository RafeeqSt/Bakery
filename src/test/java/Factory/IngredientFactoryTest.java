package Factory;

import Domain.Stock.Ingredient;
import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientFactoryTest {

    @Test
    public void getIngredient() {
        String ingredientType = "754";
        Ingredient ingredient = IngredientFactory.getIngredient(ingredientType);
        assertNotNull(ingredient.getIngredientType());
    }
}