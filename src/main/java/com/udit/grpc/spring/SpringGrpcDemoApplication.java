package com.udit.grpc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.udit")
public class SpringGrpcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGrpcDemoApplication.class, args);
	}

}
