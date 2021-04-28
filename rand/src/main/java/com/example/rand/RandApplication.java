package com.example.rand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.*;

@SpringBootApplication
@EnableEurekaClient
public class RandApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandApplication.class, args);
	}

}
