package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.Event;
import com.atelierjava.back.Repository.EventRepository;
import com.atelierjava.back.Repository.ProductRepository;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @RequestMapping(path = "/events", method = RequestMethod.GET)
    public Iterable<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    @RequestMapping(path = "/event", method = RequestMethod.POST)
    public Event addEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }
    
    @RequestMapping(path = "/event", method = RequestMethod.GET)
    public Event getEventById(@RequestParam Long id){
        Optional<Event> event = eventRepository.findById(id);
        if(event.isPresent()){
            return event.get();
        }
        return null;
    }

    @RequestMapping(path = "/event", method = RequestMethod.PATCH)
    public Event updateEventById(@RequestBody Event event){
        return eventRepository.save(event);
    }

    @RequestMapping(path = "/event", method = RequestMethod.DELETE)
    public String deleteEventById(@RequestParam Long id){
        Optional<Event> eventToDelete = eventRepository.findById(id);
        if(eventToDelete.isPresent()){
            eventRepository.deleteById(id);
            return "OK";
        }
        return "Erreur lors de la suppression.";
    }

}
