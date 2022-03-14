package com.cg.ioc;

public class Vodaphone implements Sim
{

	@Override
	public void calling() {
		System.out.println("Calling using Vodaphone mobile");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing net using Vodaphone sim");
		
	}
	
}
