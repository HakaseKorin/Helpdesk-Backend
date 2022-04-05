package com.example.services;

import com.example.models.Ticket;
import com.example.repositories.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TicketService {
    private TicketRepo ticketRepo;

    @Autowired
    public TicketService(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    public void create(Ticket ticket){
        ticketRepo.save(ticket);
    }

    public List<Ticket> getAll(){
        return ticketRepo.findAll();
    }

    public List<Ticket> getTicketByEmail(String email){
        return ticketRepo.getTicketsByEmail(email);
    }

    public void update(Ticket ticket){
        ticketRepo.save(ticket);
    }

    public void delete(Ticket ticket){
        ticketRepo.delete(ticket);
    }
}
