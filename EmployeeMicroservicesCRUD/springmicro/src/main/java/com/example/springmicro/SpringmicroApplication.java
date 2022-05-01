package com.example.springmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.springmicro")
public class SpringmicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmicroApplication.class, args);
	}

}
