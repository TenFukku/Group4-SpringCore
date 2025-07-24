package aop.service;

import aop.annotation.TrackExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @TrackExecutionTime
    public String placeOrder(boolean fail) {
        if (fail) {
            throw new RuntimeException("Order failed due to system error.");
        }
        return "Order placed successfully!";
    }
}
