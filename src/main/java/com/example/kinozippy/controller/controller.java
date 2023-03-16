package com.example.kinozippy.controller;

import com.example.kinozippy.model.Movie;
import com.example.kinozippy.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class controller {

        @Autowired
        MovieRepository movieRepository;

        @GetMapping("/movies")
        @ResponseStatus(HttpStatus.OK)
        public List<Movie> showMovies(){
                return movieRepository.findAll();
        }

        @GetMapping("/homepage")
        public String homepage(){
            return "homepage";
        }

    /*
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("theater", theater);
        model.addAttribute("seats", theater.getSeats());
        return "seats";
    }
}
*/



/*
        @PostMapping("/movies")
    @ResponseStatus(HttpStatus.CREATED)
    public Kommune postRegion(@RequestBody Kommune kommune) {
        System.out.println(kommune);
        return kommuneRepository.save(kommune);
    }
    */
}