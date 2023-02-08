package com.atelierjava.back.Controller;

import com.atelierjava.back.Entity.Artist;
import com.atelierjava.back.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ArtistController {

    @Autowired
    ArtistRepository artistRepository;

    @RequestMapping(path = "/artists", method = RequestMethod.GET)
    public Iterable<Artist> getAllArtists(){
        return artistRepository.findAll();
    }

}
