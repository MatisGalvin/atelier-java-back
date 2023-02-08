package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.Product;
import com.atelierjava.back.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public Iterable<Product> getAllProduct(){
        return productRepository.findAll();
    }


}