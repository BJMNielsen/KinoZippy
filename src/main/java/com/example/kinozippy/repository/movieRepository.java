package com.example.kinozippy.repository;

import com.example.kinozippy.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepository extends JpaRepository<Movie,Integer> {
}
