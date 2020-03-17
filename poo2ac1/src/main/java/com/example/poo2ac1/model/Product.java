package com.example.poo2ac1.model;

/**
 * Product
 */
public class Product {

    private int code;
    private String name;
    private double value;
    private int stock;

    public Product (int code, String name, double value, int stock)
    {
        this.code  = code;
        this.name  = name;
        this.stock = stock;
        this.value = value;
    }
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    
}