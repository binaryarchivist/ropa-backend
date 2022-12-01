package utm.pbl.ropa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.pbl.ropa.controller.requestbody.OrderRequestBody;
import utm.pbl.ropa.dto.model.CartDto;
import utm.pbl.ropa.service.OrderFacadeService;


import static utm.pbl.ropa.dto.mapper.CartMapper.toCartDto;


@RestController
@RequestMapping("orders")
public class OrderFacadeController {
    private final OrderFacadeService orderFacadeService;

    @Autowired
    public OrderFacadeController(OrderFacadeService orderFacadeService) {
        this.orderFacadeService = orderFacadeService;
    }

    @PostMapping
    public CartDto placeOrder(@RequestBody OrderRequestBody order) {
            return toCartDto(this.orderFacadeService.placeOrder(order.getProductId(), order.getQuantity(), order.getCartId()));
    }

    @PatchMapping
    public CartDto updateOrder(@RequestBody OrderRequestBody order) {
        return toCartDto(this.orderFacadeService.updateOrder(order.getProductId(), order.getQuantity(), order.getCartId()));
    }

    @DeleteMapping("{orderId}")
    public void deleteOrder(@PathVariable Long orderId) {
        this.orderFacadeService.deleteOrder(orderId);
    }
}
