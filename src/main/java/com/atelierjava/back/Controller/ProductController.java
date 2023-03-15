package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.Cart;
import com.atelierjava.back.Entity.CartDetails;
import com.atelierjava.back.Entity.Product;
import com.atelierjava.back.Repository.CartDetailsRepository;
import com.atelierjava.back.Repository.CartRepository;
import com.atelierjava.back.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    private CartDetailsRepository cartDetailsRepository;
    @Autowired
    private CartRepository cartRepository;

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

    @RequestMapping(path = "/addProductToCart", method = RequestMethod.POST)
    public Boolean addProductToCart(@RequestBody Product product, @RequestParam Long userId, @RequestParam int quantity) {
        Cart cart = cartRepository.findByUserId(userId);
        Optional<Product> myProduct = productRepository.findById(product.getId());

        if (myProduct.isPresent()) {
            cartDetailsRepository.save(CartDetails.builder().cart(cart).product(product).quantity(quantity).build());
            return true;
        }
        return false;
    }


}
