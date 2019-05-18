package Repository.Stock.Impl;

import Domain.Stock.Ingredient;
import Repository.Stock.IngredientRepository;

import java.util.HashSet;
import java.util.Set;

public class IngredientRepositoryImpl implements IngredientRepository {

    private static IngredientRepositoryImpl repository = null;
    private Set<Ingredient> ingredients;

    private IngredientRepositoryImpl(){
        this.ingredients = new HashSet<>();
    }

    public static IngredientRepositoryImpl getRepository(){
        if (repository == null) repository = new IngredientRepositoryImpl();
        return repository;
    }

    private Ingredient findIngredient(String ingredientType)
    {
        return this.ingredients.stream()
                .filter(Ingredient -> Ingredient.getIngredientType().trim()
                        .equals(Ingredient)).findAny().orElse(null);
    }

    @Override
    public Set<Ingredient> getAll() {
        return this.ingredients;
    }

    @Override
    public Ingredient create(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        return ingredient;
    }

    @Override
    public Ingredient update(Ingredient ingredient) {
        String id = ingredient.getIngredientType();

        Ingredient ingredientFind = findIngredient(id);

        ingredients.remove(ingredientFind);
        ingredients.add(ingredient);

        return null;
    }

    @Override
    public void delete(String s) {
        Ingredient ingredient = findIngredient(s);
        ingredients.remove(ingredient);
    }

    @Override
    public Ingredient read(String s) {
        Ingredient ingredient = findIngredient(s);
        return ingredient == null ? null: ingredient;
    }

}
