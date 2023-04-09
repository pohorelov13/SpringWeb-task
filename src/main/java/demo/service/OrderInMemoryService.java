package demo.service;

import demo.exception.OrderDoesNotExistException;
import demo.model.Order;
import demo.model.Product;
import demo.repo.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderInMemoryService implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order getById(int id) throws OrderDoesNotExistException {
        return orderRepository.getById(id);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    @Override
    public Order add(Order order) {
        double cost = 0;
        for (Product p : order.getProducts()) {
            cost += p.getCost();
        }
        order.setCost(cost);
        orderRepository.add(order);
        order.setId(orderRepository.getAll().size());
        return order;
    }
}
