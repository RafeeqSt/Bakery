package Services.Orders.Impl;

import Domain.Orders.OrderItem;
import Repository.Orders.Impl.OrderItemRepositoryImpl;
import Repository.Orders.OrderItemRepository;
import Services.Orders.OrderItemService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    private static OrderItemServiceImpl service = null;
    private OrderItemRepository repository;

    private OrderItemServiceImpl(){
        this.repository = OrderItemRepositoryImpl.getRepository();
    }

    public static OrderItemServiceImpl getService(){
        if (service == null) service = new OrderItemServiceImpl();
        return service;
    }

    @Override
    public OrderItem create(OrderItem orderItem){
        return this.repository.create(orderItem);
    }

    @Override
    public OrderItem update(OrderItem orderItem) {
        return this.repository.update(orderItem);
    }

    @Override
    public OrderItem read(String foodType){
        return this.repository.read(foodType);
    }

    @Override
    public void delete(String foodType) {
        this.repository.delete(foodType);
    }

    @Override
    public Set<OrderItem> getAll(){
        return this.repository.getAll();
    }

}
