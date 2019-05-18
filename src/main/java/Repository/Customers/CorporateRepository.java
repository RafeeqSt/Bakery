package Repository.Customers;

import Domain.Customers.Corporate;
import Repository.IRepository;

import java.util.Set;

public interface CorporateRepository extends IRepository<Corporate, String> {

    Set<Corporate> getAll();

}
