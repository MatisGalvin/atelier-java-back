package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.Event;
import com.atelierjava.back.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @RequestMapping(path = "/events", method = RequestMethod.GET)
    public Iterable<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    @RequestMapping(path = "/event", method = RequestMethod.GET)
    public Event getEventById(@RequestParam Long id){
        Optional<Event> event = eventRepository.findById(id);
        if(event.isPresent()){
            return event.get();
        }
        return null;
    }
}
