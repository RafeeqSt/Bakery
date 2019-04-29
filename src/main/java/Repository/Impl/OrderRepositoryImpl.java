package Repository.Impl;

import Domain.Orders.Order;
import Repository.OrderRepository;

import java.util.HashSet;
import java.util.Set;

public class OrderRepositoryImpl implements OrderRepository {

    private static OrderRepositoryImpl repository = null;
    private Set<Order> orders;

    private OrderRepositoryImpl(){
        this.orders = new HashSet<>();
    }

    public static OrderRepositoryImpl getRepository(){
        if (repository == null) repository = new OrderRepositoryImpl();
        return repository;
    }

    private Order findOrder(String orderNumber)
    {
        return this.orders.stream()
                .filter(Order -> Order.getOrderNumber().trim()
                        .equals(Order)).findAny().orElse(null);
    }

    @Override
    public Set<Order> getAll() {
        return this.orders;
    }

    @Override
    public Order create(Order order) {
        this.orders.add(order);
        return order;
    }

    @Override
    public Order update(Order order) {
        String id = order.getOrderNumber();

        Order orderFind = findOrder(id);

        orders.remove(orderFind);
        orders.add(order);

        return null;
    }

    @Override
    public void delete(String s) {
        Order order = findOrder(s);
        orders.remove(order);
    }

    @Override
    public Order read(String s) {
        Order order = findOrder(s);
        return order == null ? null: order;
    }

}
