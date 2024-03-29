package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.Discount;
import com.atelierjava.back.Repository.DiscountRepository;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DiscountController {

    @Autowired
    DiscountRepository discountRepository;

    @RequestMapping(path = "/discounts")
    public Iterable<Discount> getAll() {
        return discountRepository.findAll();
    }

}
