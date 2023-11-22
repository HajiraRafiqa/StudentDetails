package com.cg.service;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.repository.StudentRepository;
import com.cg.student.Student;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	static final Logger logger = LoggerFactory.getLogger(StudentService.class);
	
	// fetching all Students
	public List<Student> getAllStudents(){
		logger.info("in service");
		List<Student> std = studentRepository.findAll(); 
		return std;
	}
	
	// fetching Students by id
	public Optional<Student> getStudent(int id){
		return studentRepository.findById(id);
	}
	
	// inserting Students
	public Student addStudent(Student s) {
		return studentRepository.save(s);
	}
	
	// updating Students by id
	public void updateStudent(Student stu, int id){
		if(id == stu.getId()) {
			studentRepository.save(stu);
		}
	}
	
	// deleting all Students
	public void deleteAllStudents(){
		studentRepository.deleteAll();
	}
	
	// deleting Students by id
	public void deleteStudentByID(int id){
		studentRepository.deleteById(id);
	}
	
}