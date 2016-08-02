package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by derrickwong on 1/8/2016.
 */

@Component
@RefreshScope
public class Greeting {

    @Value("${greeting.message}")
    private String message;

    public String getMessage() {
        return message;
    }
}
