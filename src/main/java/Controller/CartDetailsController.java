package Controller;

import Entity.CartDetails;
import Entity.Product;
import Repository.CartDetailsRepository;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
