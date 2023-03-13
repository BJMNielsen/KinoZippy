package com.example.kinozippy.repository;

import com.example.kinozippy.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ticketRepository extends JpaRepository<Ticket,Integer> {
}
