package Domain.Stock;

public class Ingredient {
    private String ingredientType;


    private Ingredient() {
    }

    private Ingredient(Builder builder) {
        this.ingredientType = builder.ingredientType;

    }

    public String getIngredientType() {
        return ingredientType;
    }


    public static class Builder {

        private String ingredientType;

        public Builder ingredientType(String ingredientType) {
            this.ingredientType = ingredientType;
            return this;
        }

        public Ingredient build() {
            return new Ingredient(this);
        }

    }

    @Override
    public String toString() {
        return "Ingredient type {" + ingredientType +
                "}";
    }
}
