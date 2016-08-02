package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by derrickwong on 29/7/2016.
 */
@RestResource
public interface ReservationResource extends JpaRepository<Reservation, Long> {
}