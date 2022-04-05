package com.example.repositories;

import com.example.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MessageRepo extends JpaRepository<Message, Integer> {
    List<Message> getMessageByTicket(int ticketId);
}
