package com.example.demo.model;

public class OrderItem {
    private int product;
    private int quantity;

    public OrderItem(){}
    public OrderItem(int product,int quantity){
        this.product=product;
        this.quantity=quantity;
    }

    public int getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
