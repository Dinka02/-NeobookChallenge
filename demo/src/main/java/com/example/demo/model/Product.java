package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @Column(name = "id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "title", length = 100, nullable = false)
    private String title;
    @Column(name="description",length=100,nullable=false)
    private String description;
    @Column(name="category",length=100,nullable=false)
    private int Category;
    @Column(name="image",length=100,nullable=false)
    private String image;
    @Column(name="quantity",length=100,nullable=false)
    private int quantity;
    @Column(name="price",length=100,nullable=false)
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
