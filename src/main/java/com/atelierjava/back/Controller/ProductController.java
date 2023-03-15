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
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @RequestMapping(path = "/product", method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(path = "/product", method = RequestMethod.GET)
    public Product findProductById(@RequestParam Long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()) {
            return product.get();
        }
        return null;
    }

    @RequestMapping(path = "/product", method = RequestMethod.PATCH)
    public Product updateProductById(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(path = "product", method = RequestMethod.DELETE)
    public Boolean deleteProductById(@RequestParam Long id){
        Optional<Product> productToDelete = productRepository.findById(id);
        if(productToDelete.isPresent()){
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
