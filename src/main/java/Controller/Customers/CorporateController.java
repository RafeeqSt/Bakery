package Controller.Customers;

import Domain.Customers.Corporate;
import Services.Customers.CorporateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/Corporate")
public class CorporateController {

    @Autowired
    @Qualifier("ServiceImpl")
    private CorporateService service;

    @PostMapping("/create")
    @ResponseBody
    public Corporate create(Corporate corporate) {
        return service.create(corporate);
    }

    @PostMapping("/update")
    @ResponseBody
    public Corporate update(Corporate corporate) {
        return service.update(corporate);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Corporate read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Corporate> getAll() {
        return service.getAll();
    }

}
