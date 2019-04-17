package Domain.ItemTypes;

public class LargeCake {
    private String largeCakeCode;


    private LargeCake() {
    }

    private LargeCake(Builder builder) {
        this.largeCakeCode = builder.largeCakeCode;

    }

    public String getLargeCakeCode() {
        return largeCakeCode;
    }


    public static class Builder {

        private String largeCakeCode;

        public Builder largeCakeCode(String largeCakeCode) {
            this.largeCakeCode = largeCakeCode;
            return this;
        }

        public LargeCake build() {
            return new LargeCake(this);
        }

    }

    @Override
    public String toString() {
        return "Large cake code {" + largeCakeCode +
                "}";
    }
}
