package com.example.demo;

import com.example.demo.model.Order;
import com.example.demo.model.OrderItem;

import java.util.List;

public class OrderService {
    private final List<Order> orders;  // Assuming you have a list of orders as a data source
    private Long orderId;

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order getOrderById(Long orderId) {
        // Assuming you have a method to find an order by its ID in the list
        for (Order order : orders) {
            if (order.getId().equals(orderId)) {
                return order;
            }
        }
        return null; // Return null if the order with the specified ID is not found
    }

    public OrderService(List<Order> orders) {
        this.orders = orders;
    }

    public void deleteOrder(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Order updateOrder(Long orderId, OrderItem orderItem) {
        for (Order order : orders) {
            if (order.getId().equals(orderId)) {

                order.getOrdered_products(orderItem.getProduct());
                order.notifyAll();
                // Add other fields accordingly

                return order;
            }
        }
        return null;
    }
}

