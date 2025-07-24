package aop.controller;

import aop.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/place")
    public String placeOrder(@RequestParam boolean fail) {
        return orderService.placeOrder(fail);
    }
}
