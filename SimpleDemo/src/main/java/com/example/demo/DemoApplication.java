package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "This is test1.....";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "This is test2";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "This is test3";
	}

}
