package com.example.airlinereservation.models;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String email;

    private String phone_no;

    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;

    public Customer(String username, String password, String email, String phone_no, String address, Passenger passenger) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone_no = phone_no;
        this.address = address;
        this.passenger = passenger;
    }
    public Customer(){}

    public Passenger getPassenger() {
        return passenger;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
