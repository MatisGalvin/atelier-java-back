package com.atelierjava.back.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;

import java.util.Date;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String place;

    @ManyToOne
    private Artist artist;

    private int max_tickets;

    private int price;

    @Column(name = "start_at")
    @CreationTimestamp
    private Date start_at;

    @Column(name = "end_at")
    @CreationTimestamp
    private Date end_at;

    @Column(name = "sell_at")
    @CreationTimestamp
    private Date sell_at;

}
