package com.example.demo.model;

public class Product {
    private int id;
    private String title;
    private String description;
    private int Category;
    private String image;
    private int quantity;
    private String price;
    public Product(){}

    public Product(int id,String title,String description,int Category,String image,int quantity,String price){
        this.id=id;
        this.title=title;
        this.description=description;
        this.Category=Category;
        this.image=image;
        this.quantity=quantity;
        this.price=price;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public int getCategory(){
        return Category;
    }
    public String getImage(){
        return image;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getPrice(){
        return price;
    }


}
