package com.cg.text;

public class TestClassGeneration {
	
	public static void main(String args[])
	{
		ClassGeneration cg = new ClassGeneration();
		cg.getGeneration(2, "f");
		
		System.out.println(cg.getGeneration(2, "f"));
		System.out.println(cg.getGeneration(-1, "f"));
		System.out.println(cg.getGeneration(3, "m"));
	}

}
