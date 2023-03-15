package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.*;
import com.atelierjava.back.Repository.CartDetailsRepository;
import com.atelierjava.back.Repository.CartRepository;
import com.atelierjava.back.Repository.TicketRepository;
import com.atelierjava.back.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TicketController {

    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartDetailsRepository cartDetailsRepository;
    @Autowired
    private UserRepository userRepository;


    @RequestMapping(path="/tickets")
    public Iterable<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    @RequestMapping(path="/ticket")
    public Ticket findById(@RequestParam Long id) {
        Optional<Ticket> ticketOptional = ticketRepository.findById(id);

        if (ticketOptional.isPresent()) {
            Ticket ticket = ticketOptional.get();
            return ticket;
        }
        return null;
    }

    @RequestMapping(path = "/addTicketToCart", method = RequestMethod.POST)
    public Boolean addTicketToCart(@RequestBody Event event, @RequestParam Long userId, @RequestParam int quantity) {
        Cart cart = cartRepository.findByUserId(userId);
        Optional<User> userOptionnal = userRepository.findById(userId);
//        Optional<Ticket> myTicket = ticketRepository.findById(ticket.getId());

        if (userOptionnal.isPresent()) {
            User user = userOptionnal.get();
            Ticket addTicket = Ticket.builder().user(user).event(event)._ref("TICKET_098767687").build();
            ticketRepository.save(addTicket);

            cartDetailsRepository.save(CartDetails.builder().cart(cart).ticket(addTicket).quantity(quantity).build());
            return true;
        }
        return false;
    }
}
