package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HomeControllerClass")
public class HomeController {

	//@GetMapping("/home")
	@GetMapping("/{name}:{city}")
	public String Test(@PathVariable("name") String name,@PathVariable("city") String city)
	{
		return "hi " +name+", Home Controller from "+city+" is working !!";
	}
	
	@PostMapping("/Employee")
	public String Emp_Data(@RequestBody Employee emp)
	{
		return "Hi "+emp.getName()+" you are in "+emp.getCity()+", your id : "+emp.getId();
	}
	
	//post mapping class waleka input format: 
	//postman body->raw->json
//	{
//	    "id":101,
//	    "name": "shivani",
//	    "city":"delhi"
//	}
}