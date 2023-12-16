package com.example.demo.model;

@SuppressWarnings("unused")
public class OrderItem {
    private int product;
    private int quantity;

    @SuppressWarnings("unused")
    public OrderItem(){}
    public OrderItem(int product,int quantity){
        this.product=product;
        this.quantity=quantity;
    }

    public int getProduct() {
        return product;
    }

// --Commented out by Inspection START (12/16/2023 9:48 PM):
//    public int getQuantity() {
//        return quantity;
//    }
// --Commented out by Inspection STOP (12/16/2023 9:48 PM)
}
