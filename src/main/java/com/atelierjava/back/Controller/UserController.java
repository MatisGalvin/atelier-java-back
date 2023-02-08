package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.User;
import com.atelierjava.back.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(path = "/user")
    public User getById(@RequestParam Long id) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return user;
        }
        return null;
    }

    @RequestMapping(path = "/users")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public User createUser(@RequestBody User currentUser){
        return userRepository.save(currentUser);
    }
}
