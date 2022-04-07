package com.example.airlinereservation.repository;

import com.example.airlinereservation.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);

}
