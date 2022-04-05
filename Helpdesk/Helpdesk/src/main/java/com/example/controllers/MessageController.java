package com.example.controllers;

import com.example.models.Message;
import com.example.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/messages")
@CrossOrigin("*")
public class MessageController {

    private MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/")
    @ResponseBody
    public void create(@RequestBody Message message){ messageService.create(message);}

    @GetMapping("/")
    public List<Message> getAll(){ return messageService.getAll(); }

    @GetMapping("/{ticket_id}")
    public List<Message> getMessageByTicketId(@PathVariable("ticket_id")int ticketId){ return messageService.getMessageByTicketId(ticketId); }

    @PutMapping("/")
    @ResponseBody
    public void update(@RequestBody Message message){ messageService.update(message);}

    @DeleteMapping("/")
    @ResponseBody
    public void delete(@RequestBody Message message){ messageService.delete(message); }
}
