package Services.Customers;

import Domain.Customers.Corporate;
import Services.IService;

import java.util.Set;

public interface CorporateService extends IService<Corporate, String> {

    Set<Corporate> getAll();

}
