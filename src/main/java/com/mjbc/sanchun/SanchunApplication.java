package com.mjbc.sanchun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class SanchunApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanchunApplication.class, args);
	}

}
