package com.icesi.edu.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class APIApplication {

	public static void main(String[] args) {
		SpringApplication.run(APIApplication.class, args);
	}

}
