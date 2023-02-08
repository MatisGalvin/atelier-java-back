package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.Product;
import com.atelierjava.back.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public Iterable<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @RequestMapping(path = "/product", method = RequestMethod.GET)
    public Product findById(@RequestParam Long id) {
        Optional<Product> product = productRepository.findById(id);

        return product.orElse(null);

    }

    @RequestMapping(path = "/product", method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }


    @RequestMapping(path = "/product", method = RequestMethod.DELETE)
    public void deleteById(@RequestParam Long id) {
        productRepository.deleteById(id);
    }

    @RequestMapping(path = "/product", method = RequestMethod.PATCH)
    public Product updateById(@RequestBody Product product) {
        return productRepository.save(product);
    }


}
