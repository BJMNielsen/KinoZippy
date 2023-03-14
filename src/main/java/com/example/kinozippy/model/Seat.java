package com.example.kinozippy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "seat")
public class Seat {

    @Id
    @Column(name = "seatid")
    private int seatId;
    private int row;
    private int column;
    private boolean isReserved;


    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.isReserved = false;
    }

    public Seat() {

    }

    public Seat(int seatId) {
        this.seatId = seatId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int coloumn) {
        this.column = coloumn;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return "column " + getColumn() +" row "+ getRow();
    }
}
