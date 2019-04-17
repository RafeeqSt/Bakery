package Domain.Stock;

public class Inventory {
    private String inventoryType;


    private Inventory() {
    }

    private Inventory(Builder builder) {
        this.inventoryType = builder.inventoryType;

    }

    public String getInventoryTypeType() {
        return inventoryType;
    }


    public static class Builder {

        private String inventoryType;

        public Builder inventoryType(String inventoryType) {
            this.inventoryType = inventoryType;
            return this;
        }

        public Inventory build() {
            return new Inventory(this);
        }

    }

    @Override
    public String toString() {
        return "Inventory type {" + inventoryType +
                "}";
    }
}
