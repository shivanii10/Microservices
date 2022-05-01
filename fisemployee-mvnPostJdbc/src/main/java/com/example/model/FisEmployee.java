package com.example.model;

public class FisEmployee {
	int id;
	String name;
	String desgn;
	
	public FisEmployee(int id, String name, String desgn) {
		super();
		this.id = id;
		this.name = name;
		this.desgn = desgn;
	}
	
	public FisEmployee()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesgn() {
		return desgn;
	}

	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", designation=" +desgn+ "]";
	}
	
	

}
