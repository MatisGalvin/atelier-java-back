package com.atelierjava.back.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.context.properties.bind.Name;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 20)
    private String code;

    private int amount;

}
