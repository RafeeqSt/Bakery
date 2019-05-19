package Controller.Orders;

import Domain.Orders.Order;
import Services.Orders.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/Order")
public class OrderController {

    @Autowired
    @Qualifier("ServiceImpl")
    private OrderService service;

    @PostMapping("/create")
    @ResponseBody
    public Order create(Order order) {
        return service.create(order);
    }

    @PostMapping("/update")
    @ResponseBody
    public Order update(Order order) {
        return service.update(order);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Order read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Order> getAll() {
        return service.getAll();
    }
}
