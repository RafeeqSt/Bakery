package Domain.Stock;

public class IngredientItem {
    private String itemCode;
    private int qtyOnHand;

    private IngredientItem() {
    }

    private IngredientItem(Builder builder) {
        this.itemCode = builder.itemCode;
        this.qtyOnHand = builder.qtyOnHand;

    }

    public String getItemCode() {
        return itemCode;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public static class Builder {

        private String itemCode;
        private int qtyOnHand;

        public Builder itemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }

        public Builder qtyOnHand(int qtyOnHand) {
            this.qtyOnHand = qtyOnHand;
            return this;
        }

        public IngredientItem build() {
            return new IngredientItem(this);
        }

    }

    @Override
    public String toString() {
        return "Item code {" + itemCode + '\'' +
                ", Quantity on hand " + qtyOnHand + '\'' +
                "}";
    }
}
