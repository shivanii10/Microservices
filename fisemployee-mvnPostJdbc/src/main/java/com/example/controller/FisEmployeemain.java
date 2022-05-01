package com.example.controller;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.example.model.FisEmployee;
import com.example.service.FisEmployeeServiceImpl;
import com.example.service.IFisEmployeeService;

public class FisEmployeemain {

	public static void main(String[] args)throws SQLException, ClassNotFoundException  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IFisEmployeeService service = new FisEmployeeServiceImpl();
		
		
		//DISPLAY RECORD
		List<FisEmployee> emp = service.getAllEmployees();
		//emp.forEach(System.out::println);
			
		Iterator<FisEmployee> itr = emp.iterator();
		System.out.println("Id"+" "+"Name"+" "+"Desgn");
		while(itr.hasNext()) {
			FisEmployee e = itr.next();
			System.out.println(e.getId()+" "+e.getName()+" "+e.getDesgn());
		}
		
		//INSERT RECORD
		System.out.println("\nRecord Insertion");
		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter designation:");
		String desgn = sc.next();
		
		FisEmployee empIn = new FisEmployee(id,name,desgn);
		String result = service.insertEmp(empIn);
		System.out.println(result);
		
		
		//DELETE RECORD
		System.out.println("\nEnter id to delete record: ");
		int did = sc.nextInt();
		String dresult = service.deleteEmp(did);
		System.out.println(dresult);
		
		//DISPLAY RECORD
		List<FisEmployee> empL = service.getAllEmployees();
		System.out.println("\nTable Data ");
		empL.forEach(System.out::println);
		
	}

}
