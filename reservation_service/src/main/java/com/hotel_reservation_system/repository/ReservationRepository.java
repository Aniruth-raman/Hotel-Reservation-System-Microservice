package com.hotel_reservation_system.repository;

import com.hotel_reservation_system.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}