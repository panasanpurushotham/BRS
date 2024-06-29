package com.EduBridge.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BikeRentalSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikeRentalSystemApplication.class, args);
		System.out.println("Welcome to Bike Rental System");
	}

}