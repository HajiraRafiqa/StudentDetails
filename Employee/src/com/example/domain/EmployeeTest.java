package com.example.domain;

public class EmployeeTest {
	   public static void main(String[] args) {
	      // Test constructor and toString()
	      Employee e1 = new Employee();

	      // Test Setters and Getters
	      e1.setid(101);
	      e1.setname("Jane Smith");
	      e1.setssn("012-34-5678");
	      e1.setSalary(120345.27);
	      
	      System.out.println("id is: " + e1.getid());
	      System.out.println("firstname is: " + e1.getname());
	      System.out.println("lastname is: " + e1.getssn());
	      System.out.println("salary is: " + e1.getSalary());

	   }
	}