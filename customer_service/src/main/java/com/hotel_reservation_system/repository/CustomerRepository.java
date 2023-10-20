package com.hotel_reservation_system.repository;

import com.hotel_reservation_system.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
        Optional<Customer> findByEmail(String email);
    }

