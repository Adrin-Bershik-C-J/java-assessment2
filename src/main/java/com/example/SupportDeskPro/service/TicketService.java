package com.example.SupportDeskPro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SupportDeskPro.entity.Ticket;
import com.example.SupportDeskPro.exceptions.TicketNotFoundException;
import com.example.SupportDeskPro.repository.TicketRepository;

@Service
public class TicketService {

    TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket getTicketsById(Long ticketId) {
        return ticketRepository.findById(ticketId)
                .orElseThrow(() -> new TicketNotFoundException("Ticket not found with ID: " + ticketId));
    }

}
