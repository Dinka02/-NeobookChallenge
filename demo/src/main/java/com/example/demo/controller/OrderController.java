package com.example.demo.controller;

import com.example.demo.OrderService;
import com.example.demo.model.Order;
import com.example.demo.model.OrderItem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@Api(tags = "Order Controller")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

// --Commented out by Inspection START (12/15/2023 10:08 PM):
//    @Autowired  // Inject OrderService
//    public OrderController(OrderService orderService) {
//        this.orderService = orderService;
//    }
// --Commented out by Inspection STOP (12/15/2023 10:08 PM)

    @ApiOperation("Get all orders")
    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @ApiOperation("Get order by ID")
    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long orderId) {
        Order order = orderService.getOrderById(orderId);
        return ResponseEntity.ok(order);
    }

    @ApiOperation("Update order by ID")
    @PutMapping("/{orderId}")
    public ResponseEntity<Order> updateOrder(@PathVariable Long orderId, @RequestBody OrderItem orderItem) {
        Order updatedOrder = orderService.updateOrder(orderId, orderItem);
        return ResponseEntity.ok(updatedOrder);
    }

    @ApiOperation("Delete order by ID")
    @DeleteMapping("/{orderId}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long orderId) {
        orderService.deleteOrder(orderId);
        return ResponseEntity.ok().build();
    }
}
