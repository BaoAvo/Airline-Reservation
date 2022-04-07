package com.example.airlinereservation.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "plane")
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
     private int capacity;
}
