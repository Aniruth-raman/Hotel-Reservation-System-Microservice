package com.hotel_reservation_system.repository;

import com.hotel_reservation_system.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}