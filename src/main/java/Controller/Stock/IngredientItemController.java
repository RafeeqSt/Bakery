package Controller.Stock;

import Domain.Stock.IngredientItem;
import Services.Stock.IngredientItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/IngredientItem")
public class IngredientItemController {

    @Autowired
    @Qualifier("ServiceImpl")
    private IngredientItemService service;

    @PostMapping("/create")
    @ResponseBody
    public IngredientItem create(IngredientItem ingredientItem) {
        return service.create(ingredientItem);
    }

    @PostMapping("/update")
    @ResponseBody
    public IngredientItem update(IngredientItem ingredientItem) {
        return service.update(ingredientItem);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public IngredientItem read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<IngredientItem> getAll() {
        return service.getAll();
    }
}
