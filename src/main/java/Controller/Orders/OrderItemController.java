package Controller.Orders;

import Domain.Orders.OrderItem;
import Services.Orders.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/OrderItem")
public class OrderItemController {

    @Autowired
    @Qualifier("ServiceImpl")
    private OrderItemService service;

    @PostMapping("/create")
    @ResponseBody
    public OrderItem create(OrderItem orderItem) {
        return service.create(orderItem);
    }

    @PostMapping("/update")
    @ResponseBody
    public OrderItem update(OrderItem orderItem) {
        return service.update(orderItem);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public OrderItem read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<OrderItem> getAll() {
        return service.getAll();
    }
}
