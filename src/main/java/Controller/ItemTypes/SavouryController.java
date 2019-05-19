package Controller.ItemTypes;

import Domain.ItemTypes.Savoury;
import Services.ItemTypes.SavouryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/Savoury")
public class SavouryController {

    @Autowired
    @Qualifier("ServiceImpl")
    private SavouryService service;

    @PostMapping("/create")
    @ResponseBody
    public Savoury create(Savoury savoury) {
        return service.create(savoury);
    }

    @PostMapping("/update")
    @ResponseBody
    public Savoury update(Savoury savoury) {
        return service.update(savoury);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Savoury read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Savoury> getAll() {
        return service.getAll();
    }

}
