package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;

@RestController
public class CRUDcontroller {
	@GetMapping(value="/greet")
	public String greet() {
		return "Hello World!!!...";
	}
	@GetMapping(value="/number")
	public int number() {
		return 25;
	}
	@GetMapping(value="/student")
	public Student student() {
		return new Student(10,"John");
	}
}
