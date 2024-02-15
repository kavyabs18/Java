package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	public List<Student> getStudent();
	public Student getStudentbyid(Integer id);
	public Student getStudentByName(String name);
	public Student postStudent(Student student);
	public String deleteStudentbyid(Integer id);
	public String updateStudentbyid(Integer id, Student student);
}