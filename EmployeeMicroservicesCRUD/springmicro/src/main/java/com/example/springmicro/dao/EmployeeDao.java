package com.example.springmicro.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springmicro.model.Employee;

@Repository
@Transactional

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

}
