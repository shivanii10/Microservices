package com.example.service;

import java.sql.SQLException;
import java.util.List;

import com.example.dao.FisEmployeeDaoImpl;
import com.example.dao.IFisEmployeeDao;
import com.example.model.FisEmployee;

public class FisEmployeeServiceImpl implements IFisEmployeeService{
	
	IFisEmployeeDao dao;
	
	public FisEmployeeServiceImpl() {
		dao = new FisEmployeeDaoImpl();
	}


	public List<FisEmployee> getAllEmployees() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}


	public String insertEmp(FisEmployee emp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.insertEmp(emp);
	}


	public String deleteEmp(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.deleteEmp(id);
	}

}
