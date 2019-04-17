package Domain.Orders;

public class OrderItem {
    private String foodType;


    private OrderItem() {
    }

    private OrderItem(Builder builder) {
        this.foodType = builder.foodType;

    }

    public String getFoodType() {
        return foodType;
    }


    public static class Builder {

        private String foodType;

        public Builder foodType(String foodType) {
            this.foodType = foodType;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }

    }

    @Override
    public String toString() {
        return "Food type {" + foodType +
                "}";
    }
}
