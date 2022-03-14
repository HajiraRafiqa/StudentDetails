package com.cg.test;

import java.StringUtils.*;

public class CountryNotValidException extends Exception
{
	public CountryNotValidException()
	{
		
	}
}
public class TaxCalculator
{
	private String empName;
	private Boolean isIndian;
	private double empSal;
	private double taxAmount;
	
	public double calculateTax(String empName, Boolean isIndian, double empSal)
	{
	
		if(isIndian== false)
			{
				throw new CountryNotValidException();
			}
		
		
		if(empName == null)
		{
			throw new EmployeeNameInvalidException();
			
		}
		
		if((empSal > 100000) & (isIndian == true))
		{
			taxAmount = empSal * 8 / 100;
		}
		else if ((empSal > 50000) & (empSal < 100000) & (isIndian == true))
		{
			taxAmount = empSal * 6/100;
		}
		else
		{
			taxAmount = empSal * 5 /100;
		}
		return taxAmount;
	}
}

