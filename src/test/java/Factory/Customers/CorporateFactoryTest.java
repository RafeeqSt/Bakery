package Factory.Customers;

import Domain.Customers.Corporate;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorporateFactoryTest {

    @Test
    public void getCorporate() {
        String companyID = "064";
        String companyName = "Sweet Bakes";
        Corporate corporate = CorporateFactory.getCorporate(companyID,companyName);
        assertNotNull(corporate.getCompanyID(),corporate.getCompanyName());
    }
}