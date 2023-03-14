package com.example.kinozippy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
@Entity
public class TheaterHall {
    @Id
    private String name;
    @OneToMany(mappedBy = "seatId")
    private List<Seat> seats;

    public TheaterHall(String name, int numRows, int numColumns) {
        this.name = name;
        this.seats = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numColumns; j++) {
                seats.add(new Seat(i, j));
            }
        }
    }

    public TheaterHall() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
