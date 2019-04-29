package Repository.Impl;

import Domain.Orders.OrderItem;
import Repository.OrderItemRepository;

import java.util.HashSet;
import java.util.Set;

public class OrderItemRepositoryImpl implements OrderItemRepository {

    private static OrderItemRepositoryImpl repository = null;
    private Set<OrderItem> orderItems;

    private OrderItemRepositoryImpl(){
        this.orderItems = new HashSet<>();
    }

    public static OrderItemRepositoryImpl getRepository(){
        if (repository == null) repository = new OrderItemRepositoryImpl();
        return repository;
    }

    private OrderItem findOrderItem(String foodType)
    {
        return this.orderItems.stream()
                .filter(OrderItem -> OrderItem.getFoodType().trim()
                        .equals(OrderItem)).findAny().orElse(null);
    }

    @Override
    public Set<OrderItem> getAll() {
        return this.orderItems;
    }

    @Override
    public OrderItem create(OrderItem orderItem) {
        this.orderItems.add(orderItem);
        return orderItem;
    }

    @Override
    public OrderItem update(OrderItem orderItem) {
        String id = orderItem.getFoodType();

        OrderItem orderItemFind = findOrderItem(id);

        orderItems.remove(orderItemFind);
        orderItems.add(orderItem);

        return null;
    }

    @Override
    public void delete(String s) {
        OrderItem orderItem = findOrderItem(s);
        orderItems.remove(orderItem);
    }

    @Override
    public OrderItem read(String s) {
        OrderItem orderItem = findOrderItem(s);
        return orderItem == null ? null: orderItem;
    }

}
