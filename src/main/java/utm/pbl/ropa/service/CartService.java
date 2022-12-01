package utm.pbl.ropa.service;

import utm.pbl.ropa.model.Cart;

public interface CartService {
    Cart createCart();

    Cart getCart(Long id);

    void deleteCart(Long id);

    Cart updateCart(Cart cart, Long id);
}
