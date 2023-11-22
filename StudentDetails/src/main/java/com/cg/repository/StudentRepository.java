package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.student.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer>{

}
