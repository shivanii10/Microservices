package com.example.springbootdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8090/TestControllerClass/GetMapping

@RestController
@RequestMapping("/TestControllerClass")
public class TestController {

	@GetMapping("/test")
	public String Test()
	{
		return "hi,Test Controller is working";
	}
	
	@GetMapping("/GetMapping")
	public ResponseEntity<String> Test1()
	{
		return new ResponseEntity<String>("This is get mapping response entity",HttpStatus.OK);
	}
	
	@PostMapping("/postMapping")
	public ResponseEntity<String> PostMapping()
	{
		return new ResponseEntity<String>("This is a post mapping response entity",HttpStatus.OK);
	}
	
	@PutMapping("/PutMapping")
	public String PutMapping()
	{
		return "hi, PutMapping is working";
	}
	
	@DeleteMapping("/DeleteMapping")
	public String DeleteMapping()
	{
		return "hi,DeleteMapping is working";
	}
}
