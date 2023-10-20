package com.hotel_reservation_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReservationServiceClient {

    private final RestTemplate restTemplate;

    @Autowired
    public ReservationServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<String> makeReservationRequest() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);

        // Replace with the actual URL
        String reservationServiceUrl = "http://localhost:8081/api/reservations";
        return restTemplate.exchange(
                reservationServiceUrl,
                HttpMethod.GET,
                entity,
                String.class
        );
    }
}