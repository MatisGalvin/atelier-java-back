package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.Ticket;
import com.atelierjava.back.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path="/ticket")
public class TicketController {

    @Autowired
    TicketRepository ticketRepository;


    @RequestMapping(path="/findAll")
    public Iterable<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    @RequestMapping(path="/findById")
    public Ticket findById(@RequestParam Long id) {
        Optional<Ticket> ticketOptional = ticketRepository.findById(id);

        if (ticketOptional.isPresent()) {
            Ticket ticket = ticketOptional.get();
            return ticket;
        }
        return null;
    }
}
