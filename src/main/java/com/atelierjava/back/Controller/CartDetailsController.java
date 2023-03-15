package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.CartDetails;
import com.atelierjava.back.Repository.CartDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CartDetailsController {



        @Autowired
        CartDetailsRepository cartDetailsRepository;

        @RequestMapping(path = "/cartDetails", method = RequestMethod.GET)
        public Iterable<CartDetails> getAllCartDetails(){
                return cartDetailsRepository.findAll();
        }

        @RequestMapping(path = "/cartDetailsByUserId", method = RequestMethod.GET)
        @CrossOrigin(origins = "http://localhost:3000")
        public Iterable<CartDetails> cartDetailsByUserId(@RequestParam Long id){
                return cartDetailsRepository.findByUserId(id);
        }





}
