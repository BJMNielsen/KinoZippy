package com.example.kinozippy.config;

import com.example.kinozippy.model.TheaterHall;

public class main {
    public static void main(String[] args) {
        TheaterHall TH = new TheaterHall("fisse", 20,12);
        System.out.printf("this is seat: " + (TH.getSeats()));
    }
}

