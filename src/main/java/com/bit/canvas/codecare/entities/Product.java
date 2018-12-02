package com.bit.canvas.codecare.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author : r0v0040 (Rituraj.Vats@walmartlabs.com)
 * Date : 02/12/18
 */
@Entity
public class Product {

    @Id
    private String id;

    @NotNull
    private String name;

    @NotNull
    private double price;

    public Product() {
    }

    public Product(String id, @NotNull String name, @NotNull double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
