package Factory;

import Domain.Profile.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {
        String username = "Emp";
        String password = "pass";
        Employee employee = EmployeeFactory.getEmployee(username,password);
        assertNotNull(employee.getUsername(),employee.getPassword());
    }
}