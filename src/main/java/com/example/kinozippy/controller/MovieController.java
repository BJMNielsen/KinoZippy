package com.example.kinozippy.controller;

import com.example.kinozippy.model.Movie;
import com.example.kinozippy.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MovieController {

    @Autowired
    MovieRepository movieRepository;


    @GetMapping("/movies")
    public List<Movie> movies() {
        return movieRepository.findAll();
    }

    @PostMapping("/movie")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie postMovie(@RequestBody Movie movie) {
        System.out.println(movie);
        return movieRepository.save(movie);
    }
}
