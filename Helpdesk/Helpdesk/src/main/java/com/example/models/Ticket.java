package com.example.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @Column(name = "tid", unique = true, nullable = false)
    private int tid;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "is_open", nullable = false)
    private boolean isOpen;

    @ManyToMany
    @JsonIgnore
    @Column(name = "replies")
    private List<Message> messages;

    public Ticket() {
    }
}
