package Repository;

import Domain.Customers.Domestic;

import java.util.Set;

public interface DomesticRepository extends IRepository<Domestic, String> {

    Set<Domestic> getAll();

}
