package utm.pbl.ropa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utm.pbl.ropa.model.Cart;
import utm.pbl.ropa.repository.CartRepository;
import utm.pbl.ropa.service.CartService;

import java.util.NoSuchElementException;

@Component
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart createCart() {
        return this.cartRepository.save(new Cart());
    }

    @Override
    public Cart getCart(Long id) {
        return this.cartRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void deleteCart(Long id) {
        this.cartRepository.deleteById(id);
    }

    @Override
    public Cart updateCart(Cart newCart, Long id) {
        return this.cartRepository.findById(id)
                .map(cart -> {
                    cart.setCartStatus(newCart.getCartStatus());
                    cart.setPayed(newCart.isPayed());
                    cart.setTable(newCart.getTable());
                    return cart;
                })
                .orElseThrow(NoSuchElementException::new);
    }
}
