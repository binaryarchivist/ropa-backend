package utm.pbl.ropa.service;

import utm.pbl.ropa.model.Cart;

public interface OrderFacadeService {
    Cart placeOrder(Long productId, Long quantity, Long cartId);
    Cart updateOrder(Long productId, Long quantity, Long cartId);

    void deleteOrder(Long orderId);
}
