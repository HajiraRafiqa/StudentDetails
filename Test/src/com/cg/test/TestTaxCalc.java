package com.cg.test;

public class TestTaxCalc {
	public static void main(String args[])
	{
		TaxCalculator t = new TaxCalculator();
		t.calculateTax("abc", false, 1000);
	}
}