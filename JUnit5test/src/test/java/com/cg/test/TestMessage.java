package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMessage {
	
	private Message m;
	private String expected;
	private String actual;

	/*
	@Test
	public void testA()
	{
		String expected = "Hello";
		String actual = "Hello";
		
		assertEquals(expected, actual, "String is Changed!");
	}
	*/
	
	@BeforeEach
	public void setup()
	{
		m = new Message();
		expected = "Welcome to: Rafi";
		actual = "";
	}
	
	@Test
	public void testShowMessage()
	{
		
		actual = m.showMessage("Rafi");
		
		assertEquals(expected, actual);
	}
	
	@AfterEach
	public void clean() 
	{
		m = null;
		expected = actual = null;
		
	}
	
}
