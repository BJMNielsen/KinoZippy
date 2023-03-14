package com.example.kinozippy.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {

  @Id
  private int customerId;
  private String username;
  private String password;
  private int age;

  private int phoneNumber;

  private String email;

  @OneToMany(mappedBy = "Customer")
  @JsonBackReference
  private Set<Ticket> ticket = new HashSet<>();

  public Customer() {
  }

  public Customer(int customerId, String username, String password, int age, int phoneNumber, String email, Set<Ticket> ticket) {
    this.customerId = customerId;
    this.username = username;
    this.password = password;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.ticket = ticket;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Set<Ticket> getTicket() {
    return ticket;
  }

  public void setTicket(Set<Ticket> ticket) {
    this.ticket = ticket;
  }
}
