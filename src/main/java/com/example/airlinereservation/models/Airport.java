package com.example.airlinereservation.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "airport")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean active;
}
