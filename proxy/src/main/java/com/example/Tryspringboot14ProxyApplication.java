package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Tryspringboot14ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tryspringboot14ProxyApplication.class, args);
	}
}
