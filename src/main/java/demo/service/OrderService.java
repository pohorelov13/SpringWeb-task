package demo.service;

import demo.exception.OrderDoesNotExistException;
import demo.model.Order;

import java.util.List;

public interface OrderService {

    Order getById(int id) throws OrderDoesNotExistException;
    List<Order> getAll();
    Order add(Order order);
}
