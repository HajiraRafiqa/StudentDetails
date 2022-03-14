package com.cg.text;

public class ClassGeneration 
{
	
	private int gen;
	private String gender;
	public String getGeneration(int generation, String g)
	{
		gen = generation;
		gender = g;
		
		if(generation == 0)
		{
			return "me!";
		}
		
		else if(generation == 1)
		{
			if(g == "m")
			{
				return "son";
			}
			else if(g == "f")
			{
				return "daughter";
			}
		}
		
		else if(generation == 2)
		{
			if(g == "m")
			{
				return "grandson";
			}
			else if(g == "f")
			{
				return "granddaughter";
			}
		}
		
		else if(generation == 3)
		{
			if(g == "m")
			{
				return "great grandson";
			}
			else if(g == "f")
			{
				return "great granddaughter";
			}
		}
		
		else if(generation == -1)
		{
			if(g == "m")
			{
				return "father";
			}
			else if(g == "f")
			{
				return "mother";
			}
		}
		
		else if(generation == -2)
		{
			if(g == "m")
			{
				return "grandfather";
			}
			else if(g == "f")
			{
				return "grandmother";
			}
		}
		
		else if(generation == -3)
		{
			if(g == "m")
			{
				return "great grandfather";
			}
			else if(g == "f")
			{
				return "great grandmother";
			}
		}
		return "me!";
	}
}
