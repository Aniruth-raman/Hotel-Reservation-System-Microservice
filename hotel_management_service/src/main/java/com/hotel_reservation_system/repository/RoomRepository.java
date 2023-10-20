package com.hotel_reservation_system.repository;

import com.hotel_reservation_system.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByAvailable(boolean available);
}