package utm.pbl.ropa.dto.mapper;

import utm.pbl.ropa.dto.model.CartDto;
import utm.pbl.ropa.model.Cart;

public class CartMapper {
    public static CartDto toCartDto(Cart cart) {
        CartDto cartDto = new CartDto();

        cartDto.setCartStatus(cart.getCartStatus());
        cartDto.setPayed(cart.isPayed());
        cartDto.setOrders(cart.getOrders());

        Long totalPrice = cart.getOrders()
                .stream()
                .mapToLong(order -> order.getProduct().getPrice())
                .sum();

        cartDto.setTotalPrice(totalPrice);

        return cartDto;
    }
}
