package Domain;

/**
 * Rafeeq Stephens
 * 214099806
 * 3A
 *
 */
public class Item {

    private String name;
    private int price;

    private Item(){}

    private Item(Builder builder){
        this.name = builder.name;
        this.price = builder.price;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static class Builder{

        private String name;
        private int price;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Item build() {
            return new Item(this);
        }

    }

    @Override
    public String toString() {
        return "Company Name{" + name + '\'' +
                ", Price" + price + '\'' +
                "}";
    }

}
