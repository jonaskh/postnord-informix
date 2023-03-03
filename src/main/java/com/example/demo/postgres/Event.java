package com.example.demo.postgres;

import javax.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer eventId;
    @Column
    private String eventName;
    @Column
    private String description;

}