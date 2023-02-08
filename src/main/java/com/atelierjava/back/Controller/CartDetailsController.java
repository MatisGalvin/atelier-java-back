package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.CartDetails;
import com.atelierjava.back.Repository.CartDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CartDetailsController {

        @Autowired
        CartDetailsRepository cartDetailsRepository;

        @RequestMapping(path = "/cartDetails", method = RequestMethod.GET)
        public Iterable<CartDetails> getAllCartDetails(){
                return cartDetailsRepository.findAll();
        }




}
