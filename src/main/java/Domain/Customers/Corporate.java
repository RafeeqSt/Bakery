package Domain.Customers;

public class Corporate {
    private String companyID;
    private String companyName;

    private Corporate(){}

    private Corporate(Builder builder){
        this.companyID = builder.companyID;
        this.companyName = builder.companyName;

    }

    public String getCompanyID() {
        return companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public static class Builder{

        private String companyID;
        private String companyName;

        public Builder companyID(String companyID) {
            this.companyID = companyID;
            return this;
        }

        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Corporate build() {
            return new Corporate(this);
        }

    }

    @Override
    public String toString() {
        return "Company ID{" + companyID + '\'' +
                ", Company Name" + companyName + '\'' +
                "}";
    }
}
