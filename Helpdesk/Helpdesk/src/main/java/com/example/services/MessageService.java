package com.example.services;

import com.example.models.Message;
import com.example.repositories.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MessageService {
    private MessageRepo messageRepo;

    @Autowired
    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public void create(Message message){
        messageRepo.save(message);
    }

    public List<Message> getAll(){
        return messageRepo.findAll();
    }

    public List<Message> getMessageByTicketId(int ticketId){
        return messageRepo.getMessageByTicket(ticketId);
    }

    public void update(Message message){
        messageRepo.save(message);
    }

    public void delete(Message message){
        messageRepo.delete(message);
    }
}
