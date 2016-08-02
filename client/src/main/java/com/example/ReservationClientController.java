package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by derrickwong on 1/8/2016.
 */

@RestController
public class ReservationClientController {

    @Autowired
    private ReservationClientFallback fallback;

    @Autowired
    private ReservationClient client;

    @RequestMapping("/names")
    public List<String> getNames(){
        return client.getReservations().getContent().stream().map(r -> r.getName()).collect(Collectors.toList());
    }

//    @RequestMapping("/names/reactive")
//    public DeferredResult<List<String>> getNamesReactive(){
//        DeferredResult<List<String>> result = new DeferredResult<>();
//        client.getReservationsReactive().map(p -> p.getContent().stream().map(r -> r.getName()).collect(Collectors.toList())).subscribe(l -> result.setResult(l));
//        return result;
//
////        return client.getReservationsReactive().map(p -> p.getContent().stream().map(r -> r.getName()).collect(Collectors.toList())).toSingle();
//    }

    @RequestMapping("/reserve/{name}/{contact}")
    public void put(@PathVariable String name, @PathVariable String contact){
        Reservation r = new Reservation();
        r.setName(name);
        r.setContact(contact);
        client.reserve(r);
    }
}
