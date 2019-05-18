package Services.Profile.Impl;

import Domain.Profile.Employee;
import Repository.Profile.EmployeeRepository;
import Repository.Profile.Impl.EmployeeRepositoryImpl;
import Services.Profile.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl(){
        this.repository = EmployeeRepositoryImpl.getRepository();
    }

    public static EmployeeServiceImpl getService(){
        if (service == null) service = new EmployeeServiceImpl();
        return service;
    }

    @Override
    public Employee create(Employee employee){
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public Employee read(String userName){
        return this.repository.read(userName);
    }

    @Override
    public void delete(String userName) {
        this.repository.delete(userName);
    }

    @Override
    public Set<Employee> getAll(){
        return this.repository.getAll();
    }
}
