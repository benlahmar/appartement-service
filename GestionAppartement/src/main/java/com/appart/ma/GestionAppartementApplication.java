package com.appart.ma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GestionAppartementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionAppartementApplication.class, args);
	}

}
