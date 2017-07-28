package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class ComputeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputeServiceApplication.class, args);
	}
}