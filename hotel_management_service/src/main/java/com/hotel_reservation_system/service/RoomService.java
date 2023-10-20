package com.hotel_reservation_system.service;

import com.hotel_reservation_system.model.Room;
import com.hotel_reservation_system.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;


    public List<Room> getAvailableRooms() {
        return roomRepository.findByAvailable(true);
    }
}