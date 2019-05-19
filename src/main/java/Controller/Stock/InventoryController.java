package Controller.Stock;

import Domain.Stock.Inventory;
import Services.Stock.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/Inventory")
public class InventoryController {

    @Autowired
    @Qualifier("ServiceImpl")
    private InventoryService service;

    @PostMapping("/create")
    @ResponseBody
    public Inventory create(Inventory inventory) {
        return service.create(inventory);
    }

    @PostMapping("/update")
    @ResponseBody
    public Inventory update(Inventory inventory) {
        return service.update(inventory);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Inventory read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Inventory> getAll() {
        return service.getAll();
    }
}
