package utm.pbl.ropa.service.impl;

import org.springframework.stereotype.Component;
import utm.pbl.ropa.model.Cart;
import utm.pbl.ropa.model.Order;
import utm.pbl.ropa.model.Product;
import utm.pbl.ropa.repository.OrderRepository;
import utm.pbl.ropa.service.OrderService;

@Component
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Product product, Long quantity, Cart cart) {
        Order order = new Order();

        order.setProduct(product);
        order.setQuantity(quantity);
        order.setCart(cart);

        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Order order, Long quantity) {
        order.setQuantity(quantity);
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
