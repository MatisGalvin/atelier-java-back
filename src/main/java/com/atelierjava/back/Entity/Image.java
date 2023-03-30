package com.atelierjava.back.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long slug;

    private String name;

    @ManyToOne
    private Artist artist;

    @ManyToOne
    private User user;

    @ManyToOne
    private Event event;

    @ManyToOne
    private Product product;

}
