package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressWarnings("unused")
@Entity
@Table(name="order")
@Data
public class Order {
    @Column(name="order_number",length=45,nullable = false)
    private int order_number;
    @Column(name="products",length=100,nullable = false)
    private String products;
    @Column(name="phone_number",length=100,nullable = false)
    private int phone_number;
    @Column(name="address",length=100,nullable = false)
    private String address;
    @Column(name="comments",length=100,nullable = false)
    private String comments;
    @Column(name="total_amount",length=45,nullable = false)
    private String total_amount;
    @Column(name="created_at",length=100,nullable = false)
    private String created_at;
    @Column(name="delivery_cost",length=100,nullable = false)
    private int delivery_cost;
    @Column(name="ordered_products",length=100,nullable = false)
    private String ordered_products;

    public Order() {
    }

    public Order(String address, int order_number, int phone_number, String products, String comments,
                 String total_amount, String created_at, int delivery_cost, String ordered_products) {
        this.address = address;
        this.order_number = order_number;
        this.phone_number = phone_number;
        this.products = products;
        this.comments = comments;
        this.total_amount = total_amount;
        this.created_at = created_at;
        this.delivery_cost = delivery_cost;
        this.ordered_products = ordered_products;
    }

    @SuppressWarnings("unused")
    public String getAddress() {
        return address;
    }

    public int getOrder_number() {
        return order_number;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getProducts() {
        return products;
    }

    public String getComments() {
        return comments;
    }

    public String getTotal_amount() {
        return total_amount;
    }
    public String getCreated_at(){
        return created_at;
    }
    public int getDelivery_cost(){
        return delivery_cost;
    }
    public String getOrdered_products(int product){
        return ordered_products;
    }


    public Object getId() { return getId();
    }


}


