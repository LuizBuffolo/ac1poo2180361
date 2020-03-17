package com.example.poo2ac1.controller;

import java.util.ArrayList;

import com.example.poo2ac1.model.Product;
import com.example.poo2ac1.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProductController
 */
@Controller
@RequestMapping("/app")
public class ProductController {

    @Autowired
    private ProductService ps;

    @GetMapping("/produto/{id}")
    public ModelAndView getProduct(
        @PathVariable("id") int id
    )
    {
        ModelAndView mvp = new ModelAndView("ProductView");

        Product p;
        
        p = ps.getProduct(id);

        mvp.addObject("Produto", p);
        return mvp;
    }

    @GetMapping("produtosemestoque")
    public ModelAndView stockProducts()
    {
        ModelAndView mvp = new ModelAndView("StockProductsView");
        
        ArrayList<Product> p;

        p = ps.stockProducts();

        mvp.addObject("Produtos", p);
        return mvp;
    }
    
    @GetMapping("produtosvaloracima/{value}")
    public ModelAndView stockProductsAbove(
        @PathVariable("value") double value
    )
    {
        ModelAndView mvp = new ModelAndView("StockProductsAboveView");
        
        ArrayList<Product> p;

        p = ps.stockProductsAbove(value);

        mvp.addObject("Produtos", p);
        return mvp;
    }

    @GetMapping("produtosvalorabaixo/{value}")
    public ModelAndView stockProductsUnder(
        @PathVariable("value") double value
    )
    {
        ModelAndView mvp = new ModelAndView("StockProductsUnderView");
        
        ArrayList<Product> p;

        p = ps.stockProductsUnder(value);

        mvp.addObject("Produtos", p);
        return mvp;
    }
}