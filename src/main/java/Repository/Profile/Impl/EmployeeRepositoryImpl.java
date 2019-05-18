package Repository.Profile.Impl;

import Domain.Profile.Employee;
import Repository.Profile.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> employees;

    private EmployeeRepositoryImpl(){
        this.employees = new HashSet<>();
    }

    public static EmployeeRepositoryImpl getRepository(){
        if (repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    private Employee findEmployee(String empName)
    {
        return this.employees.stream()
                .filter(Employee -> Employee.getUsername().trim()
                        .equals(Employee)).findAny().orElse(null);
    }

    @Override
    public Set<Employee> getAll() {
        return this.employees;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        String id = employee.getUsername();

        Employee employeeFind = findEmployee(id);

        employees.remove(employeeFind);
        employees.add(employee);

        return null;
    }

    @Override
    public void delete(String s) {
        Employee employee = findEmployee(s);
        employees.remove(employee);
    }

    @Override
    public Employee read(String s) {
        Employee employee = findEmployee(s);
        return employee == null ? null: employee;
    }
}
