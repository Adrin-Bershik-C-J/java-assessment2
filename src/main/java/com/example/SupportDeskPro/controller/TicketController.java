package com.example.SupportDeskPro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SupportDeskPro.entity.Ticket;
import com.example.SupportDeskPro.service.TicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/{ticketId}")
    public Ticket getTicketsById(@PathVariable Long ticketId) {
        return ticketService.getTicketsById(ticketId);
    }
}

