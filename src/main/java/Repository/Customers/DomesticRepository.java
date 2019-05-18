package Repository.Customers;

import Domain.Customers.Domestic;
import Repository.IRepository;

import java.util.Set;

public interface DomesticRepository extends IRepository<Domestic, String> {

    Set<Domestic> getAll();

}
