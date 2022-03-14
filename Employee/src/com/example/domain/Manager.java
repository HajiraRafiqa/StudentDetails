package com.example.domain;

public class Manager extends Employee 
{
	public Manager(int empid, String name, String ssn, double salary) {
		super(empid, name, ssn, salary);
		// TODO Auto-generated constructor stub
	}


	private String deptName;
	
	
	public String getDeptName()
	{
		return deptName;
	}
	
	
}
