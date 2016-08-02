package com.example;

import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Component;

/**
 * Created by derrickwong on 1/8/2016.
 */

@Component
public class ReservationClientFallback implements ReservationClient {

    @Override
    public PagedResources<Reservation> getReservations() {
        return null;
    }

    @Override
    public void reserve(Reservation reservation) {

    }

//    @Override
//    public Observable<PagedResources<Reservation>> getReservationsReactive() {
//        return null;
//    }
}
