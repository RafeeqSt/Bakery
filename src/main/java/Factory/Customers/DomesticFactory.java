package Factory.Customers;

import Domain.Customers.Domestic;

public class DomesticFactory {

    public static Domestic getDomestic(String clientName, String clientPhoneNum) {
        return new Domestic.Builder().clientName(clientName)
                .clientPhoneNum(clientPhoneNum)
                .build();
    }
}
