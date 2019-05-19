package Controller.Stock;

import Domain.Stock.Ingredient;
import Services.Stock.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/Ingredient")
public class IngredientController {

    @Autowired
    @Qualifier("ServiceImpl")
    private IngredientService service;

    @PostMapping("/create")
    @ResponseBody
    public Ingredient create(Ingredient ingredient) {
        return service.create(ingredient);
    }

    @PostMapping("/update")
    @ResponseBody
    public Ingredient update(Ingredient ingredient) {
        return service.update(ingredient);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Ingredient read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Ingredient> getAll() {
        return service.getAll();
    }
}
