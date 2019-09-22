package com.bbtm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BesantbtmwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BesantbtmwebappApplication.class, args);
	}

}
