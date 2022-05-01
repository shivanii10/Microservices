package com.example.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.model.FisEmployee;

public interface IFisEmployeeDao {
	
	public List<FisEmployee> getAllEmployees() throws ClassNotFoundException, SQLException;
	public String insertEmp(FisEmployee emp)throws ClassNotFoundException, SQLException;
	public String deleteEmp(int id) throws ClassNotFoundException, SQLException;

}
