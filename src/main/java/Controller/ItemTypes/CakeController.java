package Controller.ItemTypes;

import Domain.ItemTypes.Cake;
import Services.ItemTypes.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/Cake")
public class CakeController {

    @Autowired
    @Qualifier("ServiceImpl")
    private CakeService service;

    @PostMapping("/create")
    @ResponseBody
    public Cake create(Cake cake) {
        return service.create(cake);
    }

    @PostMapping("/update")
    @ResponseBody
    public Cake update(Cake cake) {
        return service.update(cake);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Cake read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Cake> getAll() {
        return service.getAll();
    }

}
