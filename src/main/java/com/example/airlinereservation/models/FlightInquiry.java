package com.example.airlinereservation.models;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Timer;

@Entity
@Data
@Table(name = "flight_inquiry")
public class FlightInquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String from_city;
    private String to_city;
    private Date departure_date;
    private Date departure_time;
    private Date arrival_time;
    private int seat_economy;
    private int seat_business;
    private int seat_first_class;

    private Long price_economy;
    private Long price_business;
    private Long price_first_class;
}
