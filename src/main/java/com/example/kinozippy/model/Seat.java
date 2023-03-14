package com.example.kinozippy.model;

public class Seat {

    private char row;

    private int seatNumber;


    public Seat(char row, int seatNumber) {
        this.row = row;
        this.seatNumber = seatNumber;
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
