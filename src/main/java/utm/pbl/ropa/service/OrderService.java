package utm.pbl.ropa.service;

import utm.pbl.ropa.model.Cart;
import utm.pbl.ropa.model.Order;
import utm.pbl.ropa.model.Product;

public interface OrderService {
    Order createOrder(Product product, Long quantity, Cart cart);
    Order updateOrder(Order order, Long quantity);

    void deleteOrder(Long orderId);
}
