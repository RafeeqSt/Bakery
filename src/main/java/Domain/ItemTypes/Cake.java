package Domain.ItemTypes;

public class Cake {
    private String cakeType;


    private Cake() {
    }

    private Cake(Builder builder) {
        this.cakeType = builder.cakeType;

    }

    public String getCakeType() {
        return cakeType;
    }


    public static class Builder {

        private String cakeType;

        public Builder cakeType(String cakeType) {
            this.cakeType = cakeType;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }

    }

    @Override
    public String toString() {
        return "Cake type {" + cakeType +
                "}";
    }
}
