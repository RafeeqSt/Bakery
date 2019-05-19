package Controller.ItemTypes;

import Domain.ItemTypes.SmallCake;
import Services.ItemTypes.SmallCakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/SmallCake")
public class SmallCakeController {

    @Autowired
    @Qualifier("ServiceImpl")
    private SmallCakeService service;

    @PostMapping("/create")
    @ResponseBody
    public SmallCake create(SmallCake smallCake) {
        return service.create(smallCake);
    }

    @PostMapping("/update")
    @ResponseBody
    public SmallCake update(SmallCake smallCake) {
        return service.update(smallCake);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public SmallCake read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<SmallCake> getAll() {
        return service.getAll();
    }

}
