package Repository.Profile;

import Domain.Profile.Employee;
import Repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {

    Set<Employee> getAll();

}
