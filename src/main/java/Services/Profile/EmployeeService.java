package Services.Profile;

import Domain.Profile.Employee;
import Services.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {

    Set<Employee> getAll();

}
