package com.example.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @Column(name = "mid", unique = true, nullable = false)
    private int mid;

    @ManyToOne
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @Column(name = "sent", nullable = false)
    private Timestamp sent;

    @Column(name = "sender_id", nullable = false)
    private int sender;

    @Column(name = "body", nullable = false)
    private String body;

    public Message() {
    }
}
