package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.Cart;
import com.atelierjava.back.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @Autowired
    CartRepository cartRepository;

    //@RequestMapping(path = "/cart/allByUser")
    //public Iterable<Cart> allByUser(@RequestParam Long userId) {
    //    cartRepository.fin
    //}

}
