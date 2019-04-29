package Repository.Impl;

import Domain.Stock.IngredientItem;
import Repository.IngredientItemRepository;

import java.util.HashSet;
import java.util.Set;

public class IngredientItemRepositoryImpl implements IngredientItemRepository {

    private static IngredientItemRepositoryImpl repository = null;
    private Set<IngredientItem> ingredientItems;

    private IngredientItemRepositoryImpl(){
        this.ingredientItems = new HashSet<>();
    }

    public static IngredientItemRepositoryImpl getRepository(){
        if (repository == null) repository = new IngredientItemRepositoryImpl();
        return repository;
    }

    private IngredientItem findIngredientItem(String ingredientItemId)
    {
        return this.ingredientItems.stream()
                .filter(IngredientItem -> IngredientItem.getItemCode().trim()
                        .equals(IngredientItem)).findAny().orElse(null);
    }

    @Override
    public Set<IngredientItem> getAll() {
        return this.ingredientItems;
    }

    @Override
    public IngredientItem create(IngredientItem ingredientItem) {
        this.ingredientItems.add(ingredientItem);
        return ingredientItem;
    }

    @Override
    public IngredientItem update(IngredientItem ingredientItem) {
        String id = ingredientItem.getItemCode();

        IngredientItem ingredientItemFind = findIngredientItem(id);

        ingredientItems.remove(ingredientItemFind);
        ingredientItems.add(ingredientItem);

        return null;
    }

    @Override
    public void delete(String s) {
        IngredientItem ingredientItem = findIngredientItem(s);
        ingredientItems.remove(ingredientItem);
    }

    @Override
    public IngredientItem read(String s) {
        IngredientItem ingredientItem = findIngredientItem(s);
        return ingredientItem == null ? null: ingredientItem;
    }

}
