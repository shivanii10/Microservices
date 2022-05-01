package com.example.springmicro.service;

import java.util.List;
import java.util.Optional;

import com.example.springmicro.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee insertEmployees(Employee employee);
	public String deleteEmployee(Employee employee);
	public Optional <Employee> searchById(int id);

}
