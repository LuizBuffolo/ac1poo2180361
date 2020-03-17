package com.example.poo2ac1.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import com.example.poo2ac1.model.Product;

import org.springframework.stereotype.Repository;

/**
 * ProductRepository
 */

 @Repository
public class ProductRepository {

    HashMap <Integer, Product> hm = new HashMap<Integer, Product>();

    // public void add()
    // {
    //     hm.put(1, new Product(1, "FIFA 20", 250.00, 15));
    //     hm.put(2, new Product(2, "GTA V", 160.00, 30));
    //     hm.put(3, new Product(3, "Halo 5", 65.00, 10));
    //     hm.put(4, new Product(4, "Batman Arkham Knight", 55.00, 20));
    //     hm.put(5, new Product(5, "Diablo III", 90.00, 10));
    //     hm.put(6, new Product(6, "The Last Of Us", 100.00, 50));
    //     hm.put(7, new Product(7, "Super Mario Odssey", 190.00, 5));
    //     hm.put(8, new Product(8, "Zelda Breath Of The Wild", 190.00, 0));
    //     hm.put(9, new Product(9, "Life is Strange", 10.00, 10));
    //     hm.put(10, new Product(10, "Overcooked 2", 30.00, 90));
    // }

    public Product getProductById(int id)
    {
        hm.put(1, new Product(1, "FIFA 20", 250.00, 15));
        hm.put(2, new Product(2, "GTA V", 160.00, 30));
        hm.put(3, new Product(3, "Halo 5", 65.00, 10));
        hm.put(4, new Product(4, "Batman Arkham Knight", 55.00, 20));
        hm.put(5, new Product(5, "Diablo III", 90.00, 10));
        hm.put(6, new Product(6, "The Last Of Us", 100.00, 50));
        hm.put(7, new Product(7, "Super Mario Odssey", 190.00, 5));
        hm.put(8, new Product(8, "Zelda Breath Of The Wild", 190.00, 0));
        hm.put(9, new Product(9, "Life is Strange", 10.00, 10));
        hm.put(10, new Product(10, "Overcooked 2", 30.00, 90));
        return hm.get(id);
    }

    public ArrayList<Product> Products()
    {
        hm.put(1, new Product(1, "FIFA 20", 250.00, 15));
        hm.put(2, new Product(2, "GTA V", 160.00, 30));
        hm.put(3, new Product(3, "Halo 5", 65.00, 10));
        hm.put(4, new Product(4, "Batman Arkham Knight", 55.00, 20));
        hm.put(5, new Product(5, "Diablo III", 90.00, 10));
        hm.put(6, new Product(6, "The Last Of Us", 100.00, 50));
        hm.put(7, new Product(7, "Super Mario Odssey", 190.00, 5));
        hm.put(8, new Product(8, "Zelda Breath Of The Wild", 190.00, 0));
        hm.put(9, new Product(9, "Life is Strange", 10.00, 10));
        hm.put(10, new Product(10, "Overcooked 2", 30.00, 90));
        Collection<Product> values = hm.values();
        ArrayList<Product> p = new ArrayList<Product>(values);
        return p;
    }
}