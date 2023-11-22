package com.cg.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.StudentService;
import com.cg.student.Student;


@RestController
@RequestMapping("/studentinfo")
public class Controller {
	static final Logger logger = LoggerFactory.getLogger(Controller.class);

	@Autowired
	private StudentService studentService;
	
	// displaying list of all Students
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
        logger.info("get all");
		return studentService.getAllStudents();
	}

	// displaying students by id
	@GetMapping("/students/{id}")
	public Optional<Student> getStudent(@PathVariable int id){
		logger.info("get stud");
		return studentService.getStudent(id);
	}
	
	// inserting students
	@PostMapping("/students")
	public ResponseEntity<Student> addStudents(@RequestBody Student s){
		logger.info("add stud");
		Student status = studentService.addStudent(s);
		return ResponseEntity.ok(status);
	}

	//updating students by id
	@PutMapping("/students/{id}")
	public void updateStudent(@RequestBody Student s, @PathVariable int id){
		logger.info("update stud");
		studentService.updateStudent(s, id);
	}
	
	// deleting all students
	@DeleteMapping("/students")
	public void deleteAllStudent(){
		logger.info("delete all");
		studentService.deleteAllStudents();
	}

	// deleting students by id
	@DeleteMapping("students/{id}")
	public void deleteStudentByID(@PathVariable int id){
		logger.info("delete id");
		studentService.deleteStudentByID(id);
	}
}
