package com.cg.ioc;

public class Airtel implements Sim
{

	public Airtel()
	{
		System.out.println("Airtel constructor called");
	}
	@Override
	public void calling() {
		System.out.println("Calling using Airtel mobile");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing net using Airtel sim");
		
	}
	
}
