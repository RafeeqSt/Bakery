package Domain.ItemTypes;

public class SmallCake {
    private String smallCakeCode;


    private SmallCake() {
    }

    private SmallCake(Builder builder) {
        this.smallCakeCode = builder.smallCakeCode;

    }

    public String getSmallCakeCode() {
        return smallCakeCode;
    }


    public static class Builder {

        private String smallCakeCode;

        public Builder smallCakeCode(String smallCakeCode) {
            this.smallCakeCode = smallCakeCode;
            return this;
        }

        public SmallCake build() {
            return new SmallCake(this);
        }

    }

    @Override
    public String toString() {
        return "Small cake code {" + smallCakeCode +
                "}";
    }
}
