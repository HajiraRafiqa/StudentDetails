package com.cg.student;

import javax.persistence.Id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cg.controller.Controller;


@Document(collection="student")
public class Student {

	@Id
	private int id;
	private String name;
	private int age;
	private float salary;
	
	static final Logger logger = LoggerFactory.getLogger(Student.class);
	
	public Student(){
		logger.info("def cons");
	}
	public Student(int id, String name, int age, float salary) {
		logger.info("param cons");
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public int getId() {
		logger.info("id");
		return id;
	}


	public String getName() {
		logger.info("name");
		return name;
	}


	public int getAge() {
		logger.info("age");
		return age;
	}


	public void setAge(int age) {
		logger.info("set age");
		this.age = age;
	}


	public float getSalary() {
		logger.info("get sal");
		return salary;
	}


	public void setSalary(float salary) {
		logger.info("set sal");
		this.salary = salary;
	}


	public void setId(int id) {
		logger.info("set id");
		this.id = id;
	}


	public void setName(String name) {
		logger.info("set name");
		this.name = name;
	}

}
