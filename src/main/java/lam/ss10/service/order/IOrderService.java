package lam.ss10.service.order;

import lam.ss10.model.Order;
import lam.ss10.model.Product;

import java.util.Optional;

public interface IOrderService {
    Iterable<Order> findAll();
    Optional<Order> findById(Long id);
    void save(Order order);

    void remove(Long id);
}
