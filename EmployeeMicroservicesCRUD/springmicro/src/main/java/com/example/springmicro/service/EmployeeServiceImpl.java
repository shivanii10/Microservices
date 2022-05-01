package com.example.springmicro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmicro.dao.EmployeeDao;
import com.example.springmicro.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao dao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Employee insertEmployees(Employee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}

	@Override
	public String deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dao.delete(employee);
		return "deleted";
	}

	@Override
	public Optional<Employee> searchById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
