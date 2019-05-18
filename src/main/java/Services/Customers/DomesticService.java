package Services.Customers;

import Domain.Customers.Domestic;
import Services.IService;

import java.util.Set;

public interface DomesticService extends IService<Domestic, String> {

    Set<Domestic> getAll();

}
