package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="productCategory")
@Data
public class ProductCategory{
    @Id
    @Column(name="id",length=45,nullable=false)
    private  int id;
    @Column(name="name",length=256,nullable = false)
    private String name;
    @Column(name="image",length=256,nullable=false)
    private String image;

    public ProductCategory(int id,String name,String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getImage(){
        return image;
    }

}
