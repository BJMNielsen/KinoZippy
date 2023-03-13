package com.example.kinozippy.model;

import jakarta.persistence.Id;

public class Customer {

  @Id
  private int customerId;
  private String username;
  private String password;

  private int phoneNumber;

  private String email;

  private Ticket ticket;

}
