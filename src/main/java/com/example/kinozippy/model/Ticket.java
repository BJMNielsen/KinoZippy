package com.example.kinozippy.model;

import jakarta.persistence.Id;

import java.util.Date;

public class Ticket {

  @Id
  private int ticketId;
  private int seatValue;

  private Movie movie;

}
