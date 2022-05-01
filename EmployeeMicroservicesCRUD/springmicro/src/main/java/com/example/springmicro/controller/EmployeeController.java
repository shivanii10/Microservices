package com.example.springmicro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmicro.model.Employee;
import com.example.springmicro.service.EmployeeService;

//http://localhost:8081/all

@RestController
public class EmployeeController {


	@Autowired
	EmployeeService service;
	
	@GetMapping("/all")
	public List<Employee> ShowAllEmps()
	{
		return service.getAllEmployees();
	}
	
	@GetMapping("/try")
	public String tr()
	{
		return "Trial statement";
	}
	
	@PostMapping("/add")
	public Employee InsertEmp(@RequestBody Employee employee)
	{
		return service.insertEmployees(employee);
	}
	
	@DeleteMapping("/delete")
	public String DeleteEmp(@RequestBody Employee employee)
	{
		return service.deleteEmployee(employee);
	}
	
	@GetMapping("/search/{id}")
	public Optional<Employee> searchById(@PathVariable("id") Integer id)
	{
		return service.searchById(id);
	}
	
}

