package Repository;

import Domain.Customers.Corporate;

import java.util.Set;

public interface CorporateRepository extends IRepository<Corporate, String> {

    Set<Corporate> getAll();

}
