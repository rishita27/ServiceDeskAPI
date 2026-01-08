package com.rkotiyal.servicedesk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ServiceDeskApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDeskApiApplication.class, args);
	}

}
