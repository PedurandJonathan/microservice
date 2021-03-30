package com.example.frontwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class FrontwebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontwebserviceApplication.class, args);
	}

}
