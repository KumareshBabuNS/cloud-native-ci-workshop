package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.hateoas.config.EnableHypermediaSupport;


@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Tryspringboot14ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tryspringboot14ClientApplication.class, args);
	}
}
