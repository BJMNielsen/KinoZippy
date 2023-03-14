package com.example.kinozippy.model;

import jakarta.persistence.*;


@Entity
public class Ticket {

  @Id
  private int ticketId;
  private int seatValue;

  @ManyToOne
  @JoinColumn(name = "title",referencedColumnName = "title")
  private Movie movie;

  public Ticket() {
  }


  public int getTicketId() {
    return ticketId;
  }

  public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
  }

  public int getSeatValue() {
    return seatValue;
  }

  public void setSeatValue(int seatValue) {
    this.seatValue = seatValue;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }
}
