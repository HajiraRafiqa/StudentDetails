package com.example.domain;

public class Director extends Manager
{
	
	public Director(int empid, String name, String ssn, double salary) {
		super(empid, name, ssn, salary);
		// TODO Auto-generated constructor stub
	}

	private double budget;
	
	public double getBudget()
	{
		return budget;
	}

}
