package model;

public class Order {

    private int order_number;
    private String products;
    private int phone_number;
    private String address;

    private String comments;
    private String total_amount;
    private String created_at;
    private int delivery_cost;

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
    public String getOrdered_products(){
        return ordered_products;
    }


}


