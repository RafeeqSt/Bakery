package Factory.Customers;

import Domain.Customers.Domestic;
import org.junit.Test;

import static org.junit.Assert.*;

public class DomesticFactoryTest {

    @Test
    public void getDomestic() {
        String clientName = "John Doe";
        String clientPhoneNumber = "021 345 6789";
        Domestic domestic = DomesticFactory.getDomestic(clientName,clientPhoneNumber);
        assertNotNull(domestic.getClientName(),domestic.getClientPhoneNum());
    }
}