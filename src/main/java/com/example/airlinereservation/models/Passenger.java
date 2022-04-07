package com.example.airlinereservation.models;


import javax.persistence.*;
import java.util.Set;

@Entity

@Table(name = "passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pnr;
    private String name;
    private int age;
    private String gender;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "customer_id", nullable = false, unique = true)
//    private Customer customer;

    @OneToMany(mappedBy = "passenger", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Ticket> ticket;

    public Passenger(String pnr, String name, int age, String gender) {
        this.pnr = pnr;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Passenger(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
}
