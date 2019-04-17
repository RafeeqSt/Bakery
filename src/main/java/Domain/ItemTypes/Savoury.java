package Domain.ItemTypes;

public class Savoury {
    private String savouryCode;


    private Savoury() {
    }

    private Savoury(Builder builder) {
        this.savouryCode = builder.savouryCode;

    }

    public String getSmallCakeCode() {
        return savouryCode;
    }


    public static class Builder {

        private String savouryCode;

        public Builder savouryCode(String savouryCode) {
            this.savouryCode = savouryCode;
            return this;
        }

        public Savoury build() {
            return new Savoury(this);
        }

    }

    @Override
    public String toString() {
        return "Savoury code {" + savouryCode +
                "}";
    }
}
