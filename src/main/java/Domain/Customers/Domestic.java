package Domain.Customers;

public class Domestic {
    private String clientName;
    private String clientPhoneNum;

    private Domestic(){}

    private Domestic(Builder builder){
        this.clientName = builder.clientName;
        this.clientPhoneNum = builder.clientPhoneNum;

    }

    public String getClientName() {
        return clientName;
    }

    public String getClientPhoneNum() {
        return clientPhoneNum;
    }

    public static class Builder{

        private String clientName;
        private String clientPhoneNum;

        public Builder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public Builder clientPhoneNum(String clientPhoneNum) {
            this.clientPhoneNum = clientPhoneNum;
            return this;
        }

        public Domestic build() {
            return new Domestic(this);
        }

    }

    @Override
    public String toString() {
        return "Client name{" + clientName + '\'' +
                ", Client phone number" + clientPhoneNum + '\'' +
                "}";
    }
}
