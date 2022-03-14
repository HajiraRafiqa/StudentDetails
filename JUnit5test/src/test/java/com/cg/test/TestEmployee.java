package com.cg.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@DisplayName("TESTING")
public class TestEmployee {
	
	@BeforeAll
	public static void setupOnce()
	{
		System.out.println("Start Once");
	}
	
	@AfterAll
	public static void setupOnce1()
	{
		System.out.println("End Once");
	}
	
	@BeforeEach
	public void setup()
	{
		System.out.println("Start");
	}
	
	@AfterEach
	public void setdown()
	{
		System.out.println("End");
	}
	
	@Test
	//@Order(5)
	@DisplayName("S1")
	@Disabled
	@Tag("prod")
	public void testSave()
	{
		System.out.println("Hello");
	}
	
	@Test
	//@Order(25)
	@Tag("dev")
	public void testUpdate()
	{
		System.out.println("Hello 1");
	}
	
	@Test
	//@Order(3)
	public void testModify()
	{
		System.out.println("Hello World");
	}
	
	@RepeatedTest(value = 3
			//, name="{displayName} - {currentRepetition}:p {totalRepetitions}"
			)
	@DisplayName("Call Method")
	public void call(TestInfo info)
	{
		System.out.println("Repeat:" + info.getTestMethod().get().getName());
		System.out.println("Repeat:" + info.getTestClass().get().getName());
		System.out.println("Repeat:" + info.getDisplayName());
	}

}
