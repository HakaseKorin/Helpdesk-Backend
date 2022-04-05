package com.example.controllers;

import com.example.models.Ticket;
import com.example.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tickets")
@CrossOrigin("*")
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/")
    @ResponseBody
    public void create(@RequestBody Ticket ticket){ ticketService.create(ticket);}

    @GetMapping("/")
    public List<Ticket> getAllTickets(){ return ticketService.getAll();}

    @GetMapping("/{email}")
    public List<Ticket> getTicketsByEmail(@PathVariable("email")String email){ return ticketService.getTicketByEmail(email);}

    @PutMapping("/")
    @ResponseBody
    public void updateTicket(@RequestBody Ticket ticket){ ticketService.update(ticket);}

    @DeleteMapping("/")
    @ResponseBody
    public void deleteTicket(@RequestBody Ticket ticket){ ticketService.delete(ticket); }
}
