package com.example.domain;

public class Employee
{
	private int employee_id;
	private String employee_name;
	private String emp_ssn;
	private double emp_sal;
	
	
	public Employee(int empid, String name, String ssn, double salary)
	{
		employee_id = empid;
		employee_name = name;
		emp_ssn = ssn;
		emp_sal = salary; 
	}
	
	public void setname (String name)
	{
		employee_name = name;
	}
	
	
	public int getid()
	{
		return employee_id;
	}
	
	
	public String getname()
	{
		return employee_name;
	}
	
	public String getssn()
	{
		return emp_ssn;
	}
	
	
	public double getSalary()
	{
		return emp_sal;
	}
	
	public double raiseSalary(double increase)
	{
		emp_sal += increase;
		return emp_sal;
	}
	
}