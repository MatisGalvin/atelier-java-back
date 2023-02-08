package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.Event;
import com.atelierjava.back.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @RequestMapping(path = "/events", method = RequestMethod.GET)
    public Iterable<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    @RequestMapping(path = "/event", method = RequestMethod.POST)
    public Event addEvent(@RequestParam Event event) {
        return eventRepository.save(event);
    }
}
