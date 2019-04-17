package Factory;

import Domain.Customers.Corporate;

public class CorporateFactory {

    public static Corporate getCorporate(String companyID, String companyName) {
        return new Corporate.Builder().companyID(companyID)
                .companyName(companyName)
                .build();
    }
}
