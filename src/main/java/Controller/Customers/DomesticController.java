package Controller.Customers;

import Domain.Customers.Domestic;
import Services.Customers.DomesticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/Corporate")
public class DomesticController {

    @Autowired
    @Qualifier("ServiceImpl")
    private DomesticService service;

    @PostMapping("/create")
    @ResponseBody
    public Domestic create(Domestic domestic) {
        return service.create(domestic);
    }

    @PostMapping("/update")
    @ResponseBody
    public Domestic update(Domestic domestic) {
        return service.update(domestic);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Domestic read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Domestic> getAll() {
        return service.getAll();
    }
}
