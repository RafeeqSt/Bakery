package Domain.Orders;

public class Order {
    private String orderNumber;


    private Order() {
    }

    private Order(Builder builder) {
        this.orderNumber = builder.orderNumber;

    }

    public String getOrderNumber() {
        return orderNumber;
    }


    public static class Builder {

        private String orderNumber;

        public Builder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

    }

    @Override
    public String toString() {
        return "Order number {" + orderNumber +
                "}";
    }
}
