package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;

//	Get the List of Student 
	@GetMapping(value="/get")
	public List<Student> getStudent() {
		return studentservice.getStudent();
	}
	
//	Get Student by Id 	
	@GetMapping(value="/getbyid/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return studentservice.getStudentbyid(id);
	}
	
//	Get Student by Name
	@GetMapping(value="/getbyname/{name}")
	public Student getStudentByName(@PathVariable String name) {
		return studentservice.getStudentByName(name);
	}
	
//	Insert a Student into DB
	@PostMapping(value="/post")
	public Student postStudent(@RequestBody Student student) {
		return studentservice.postStudent(student);
	}
	
//	Delete Student by Id 	
	@DeleteMapping(value="/delete/{id}")
	public String deleteStudentById(@PathVariable Integer id) {
		return studentservice.deleteStudentbyid(id);
	}
	
//	Update Student by Id
	@PutMapping(value="/put/{id}")
	public String updateStudentById(@PathVariable Integer id,
			@RequestBody Student student) {
		return studentservice.updateStudentbyid(id,student);
	}
}
