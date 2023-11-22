package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDetailsApplication {

	public static void main(String[] args) {
		System.out.println("Started Running");
		try {
			SpringApplication.run(StudentDetailsApplication.class, args);
		} catch (StringIndexOutOfBoundsException siobe) {
			System.out.println("invalid input");
	    }
	}

}
