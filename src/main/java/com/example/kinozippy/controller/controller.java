package com.example.kinozippy.controller;

import ch.qos.logback.core.model.Model;
import com.example.kinozippy.model.Ticket;
import com.example.kinozippy.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class controller {

    @Autowired
    TicketRepository ticketRepository;


    @GetMapping("/tickets")
    public List<Ticket> tickets() {
         return ticketRepository.findAll();
    }

    @PostMapping("/ticket")
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket postTicket(@RequestBody Ticket ticket) {
        System.out.println(ticket);
        return ticketRepository.save(ticket);
    }
}
