package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by derrickwong on 1/8/2016.
 */

@FeignClient(value="TrySpringBoot14"
//        , fallback = com.example.ReservationClientFallback.class
)
public interface ReservationClient {

    @RequestMapping("/reservations")
    PagedResources<Reservation> getReservations();

    @RequestMapping(value = "/reservations", method = RequestMethod.POST)
    void reserve(Reservation reservation);


//    @RequestMapping("/reservations")
//    Observable<PagedResources<Reservation>> getReservationsReactive();

}

