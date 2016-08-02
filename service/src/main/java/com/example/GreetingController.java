package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by derrickwong on 1/8/2016.
 */

@RestController
public class GreetingController {

    @Autowired
    private Greeting greeting;

    @RequestMapping("/greeting")
    public String greeting(){
        return greeting.getMessage();
    }
}
