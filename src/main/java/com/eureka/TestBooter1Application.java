package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TestBooter1Application {

	public static void main(String[] args) {
		System.out.println("cicd test lily holy night");
		SpringApplication.run(TestBooter1Application.class, args);
	}

}
