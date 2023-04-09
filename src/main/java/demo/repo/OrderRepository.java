package demo.repo;

import demo.exception.OrderDoesNotExistException;
import demo.model.Order;

import java.util.List;

public interface OrderRepository {

    Order getById(int id) throws OrderDoesNotExistException;
    List<Order> getAll();
    Order add(Order order);
}
