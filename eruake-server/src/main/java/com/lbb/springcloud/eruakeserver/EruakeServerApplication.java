package com.lbb.springcloud.eruakeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EruakeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EruakeServerApplication.class, args);
	}


}
