package Services.Orders.Impl;

import Domain.Orders.Order;
import Repository.Orders.Impl.OrderRepositoryImpl;
import Repository.Orders.OrderRepository;
import Services.Orders.OrderService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {

    private static OrderServiceImpl service = null;
    private OrderRepository repository;

    private OrderServiceImpl(){
        this.repository = OrderRepositoryImpl.getRepository();
    }

    public static OrderServiceImpl getService(){
        if (service == null) service = new OrderServiceImpl();
        return service;
    }

    @Override
    public Order create(Order order){
        return this.repository.create(order);
    }

    @Override
    public Order update(Order order) {
        return this.repository.update(order);
    }

    @Override
    public Order read(String foodType){
        return this.repository.read(foodType);
    }

    @Override
    public void delete(String foodType) {
        this.repository.delete(foodType);
    }

    @Override
    public Set<Order> getAll(){
        return this.repository.getAll();
    }

}
