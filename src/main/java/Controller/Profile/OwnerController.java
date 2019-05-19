package Controller.Profile;

import Domain.Profile.Employee;
import Domain.Profile.Owner;
import Services.Profile.EmployeeService;
import Services.Profile.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/Owner")
public class OwnerController {

    @Autowired
    @Qualifier("ServiceImpl")
    private OwnerService service;

    @PostMapping("/create")
    @ResponseBody
    public Owner create(Owner owner) {
        return service.create(owner);
    }

    @PostMapping("/update")
    @ResponseBody
    public Owner update(Owner owner) {
        return service.update(owner);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Owner read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Owner> getAll() {
        return service.getAll();
    }
}
