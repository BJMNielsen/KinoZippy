package com.example.kinozippy.model;

import jakarta.persistence.*;


@Entity
public class Ticket {

  @Id
  private int ticketId;
  private int seatValue;
  @ManyToOne
  @JoinColumn(name = "title",referencedColumnName = "title")
  private Showing showing;

  public Ticket(int ticketId, int seatValue, Showing showing) {
    this.ticketId = ticketId;
    this.seatValue = seatValue;
    this.showing = showing;
  }

  public Showing getShowing() {
    return showing;
  }

  public void setShowing(Showing showing) {
    this.showing = showing;
  }



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

}
