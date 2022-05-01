package com.example.service;

import java.sql.SQLException;
import java.util.List;

import com.example.model.FisEmployee;

public interface IFisEmployeeService {

	public List<FisEmployee> getAllEmployees() throws ClassNotFoundException, SQLException;
	public String insertEmp(FisEmployee emp)throws ClassNotFoundException, SQLException;
	public String deleteEmp(int id) throws ClassNotFoundException, SQLException;

}
