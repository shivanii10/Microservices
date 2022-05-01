package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.model.FisEmployee;

public class FisEmployeeDaoImpl implements IFisEmployeeDao{

	public List<FisEmployee> getAllEmployees() throws ClassNotFoundException, SQLException
	{
		List<FisEmployee> employee = new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);

		Statement st = con.createStatement();
		
		String sql = "select * from FisEmployee";

		ResultSet rs = st.executeQuery(sql);

		while (rs.next())
		{
			FisEmployee emp = new FisEmployee(rs.getInt(1),rs.getString(2),rs.getString(3));
			employee.add(emp);
			//System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getString(3));
		}
		
		rs.close();
		st.close();
		con.close();
		return employee;
	}

	public String insertEmp(FisEmployee emp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<FisEmployee> employee = new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String username = "root";
		String password = "root";//

		Connection con = DriverManager.getConnection(url, username, password);
		String sql = "insert into fisemployee values (?,?,?)";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, emp.getId());
		pst.setString(2, emp.getName());
		pst.setString(3, emp.getDesgn());

		pst.executeUpdate();

		pst.close();
		con.close();
		return "Record Inserted";
	}

	public String deleteEmp(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);
		String delete = "delete from fisemployee where id=?";
		PreparedStatement pst = con.prepareStatement(delete);
		pst.setInt(1, id);
		
		int count= pst.executeUpdate();
		pst.close();
		con.close();
		return count+" record Deleted...";
	}




}
