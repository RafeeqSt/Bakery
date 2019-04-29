package Repository;

import Domain.Profile.Employee;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {

    Set<Employee> getAll();

}
