package Controller.ItemTypes;

import Domain.ItemTypes.LargeCake;
import Services.ItemTypes.LargeCakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/LargeCake")
public class LargeCakeController {

    @Autowired
    @Qualifier("ServiceImpl")
    private LargeCakeService service;

    @PostMapping("/create")
    @ResponseBody
    public LargeCake create(LargeCake largeCake) {
        return service.create(largeCake);
    }

    @PostMapping("/update")
    @ResponseBody
    public LargeCake update(LargeCake largeCake) {
        return service.update(largeCake);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public LargeCake read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<LargeCake> getAll() {
        return service.getAll();
    }

}
