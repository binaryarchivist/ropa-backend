package utm.pbl.ropa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utm.pbl.ropa.model.Cart;
import utm.pbl.ropa.model.Order;
import utm.pbl.ropa.model.Product;
import utm.pbl.ropa.service.CartService;
import utm.pbl.ropa.service.OrderFacadeService;
import utm.pbl.ropa.service.OrderService;
import utm.pbl.ropa.service.ProductService;

import java.util.Objects;
import java.util.Set;

@Component
public class OrderFacadeServiceImpl implements OrderFacadeService {
    private final OrderService orderService;
    private final CartService cartService;
    private final ProductService productService;

    @Autowired
    public OrderFacadeServiceImpl(OrderService orderService, CartService cartService, ProductService productService) {
        this.orderService = orderService;
        this.cartService = cartService;
        this.productService = productService;
    }

    @Override
    public Cart placeOrder(Long productId, Long quantity, Long cartId) {
        Product product = productService.getProductById(productId);
        Cart cart = cartService.getCart(cartId);

        return orderService.createOrder(product, quantity, cart).getCart();

    }

    @Override
    public Cart updateOrder(Long productId, Long quantity, Long cartId) {
        Cart cart = cartService.getCart(cartId);

        Set<Order> orders = cart.getOrders();
        Order currentOrder = (Order) orders.stream().filter(order -> Objects.equals(order.getProduct().getProductId(), productId));
        return orderService.updateOrder(currentOrder, quantity).getCart();
    }

    @Override
    public void deleteOrder(Long orderId) {
        orderService.deleteOrder(orderId);
    }
}
