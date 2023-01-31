package com.jr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jr.*")
public class EmployeesCredentialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesCredentialsApplication.class, args);
	}

}
