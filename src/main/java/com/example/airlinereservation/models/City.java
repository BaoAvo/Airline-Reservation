package com.example.airlinereservation.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city_name;
    private String country;
    private String city_code;

}
