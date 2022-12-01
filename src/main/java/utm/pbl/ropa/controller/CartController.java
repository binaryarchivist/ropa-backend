package utm.pbl.ropa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.pbl.ropa.dto.model.CartDto;
import utm.pbl.ropa.service.CartService;

import static utm.pbl.ropa.dto.mapper.CartMapper.toCartDto;

@RestController
@RequestMapping("cart")
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("{id}")
    public CartDto getCart(@PathVariable Long id) {
        return toCartDto(this.cartService.getCart(id));
    }

    @PostMapping
    public CartDto createCart() {
        return toCartDto(this.cartService.createCart());
    }
}
