package com.example.poo2ac1.service;

import java.util.ArrayList;

import com.example.poo2ac1.model.Product;
import com.example.poo2ac1.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductService
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;

    public Product getProduct(int id)
    {
        if (id == 0)
            return null;

        Product p = pr.getProductById(id);

        return p;
    }

    public ArrayList<Product> stockProducts()
    {
        if(pr.Products().isEmpty())
            return null;
        
        ArrayList<Product> p = new ArrayList<Product>();

        for (Product product : pr.Products()) 
        {
            if (product.getStock() != 0)
                p.add(product);
        }
        
        return p;
    }

    public ArrayList<Product> stockProductsAbove(double value)
    {
        if(pr.Products().isEmpty())
            return null;
        
        ArrayList<Product> p = new ArrayList<Product>();

        for (Product product : pr.Products()) 
        {
            if (product.getValue() >= value && product.getStock() != 0)
                p.add(product);
        }
        
        return p;
    }

    public ArrayList<Product> stockProductsUnder(double value)
    {
        if(pr.Products().isEmpty())
            return null;
        
        ArrayList<Product> p = new ArrayList<Product>();

        for (Product product : pr.Products()) 
        {
            if (product.getValue() <= value && product.getStock() != 0)
                p.add(product);
        }
        
        return p;
    }
}