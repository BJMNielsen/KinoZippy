package com.example.kinozippy.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Showing {
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "movie", referencedColumnName = "title")
    private Movie movie;

    private LocalDateTime startDateTime;


}
