package Controller.Stock;

import Domain.Stock.Equipment;
import Services.Stock.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/Equipment")
public class EquipmentController {

    @Autowired
    @Qualifier("ServiceImpl")
    private EquipmentService service;

    @PostMapping("/create")
    @ResponseBody
    public Equipment create(Equipment equipment) {
        return service.create(equipment);
    }

    @PostMapping("/update")
    @ResponseBody
    public Equipment update(Equipment equipment) {
        return service.update(equipment);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Equipment read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Equipment> getAll() {
        return service.getAll();
    }
}
