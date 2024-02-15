package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{
	@Autowired
	StudentRepository studentrepository;
	
	public List<Student> getStudent() {
		return studentrepository.findAll();
	}
	
	public Student getStudentbyid(Integer id) {
		Optional<Student> student = studentrepository.findById(id);
		return student.orElse(null);
	}

	public Student getStudentByName(String name) {
		Student student = studentrepository.findByname(name);
		return student;
	}

	public Student postStudent(Student student) {
		Student s = studentrepository.save(student);
		return s;
	}

	public String deleteStudentbyid(Integer id) {
		studentrepository.deleteById(id);
		return "Deletion Success";
	}

	public String updateStudentbyid(Integer id, Student updatingStudent) {
		
		//get the record from DB
		Optional<Student> existingStudent = studentrepository.findById(id);
		
		if(existingStudent.isPresent()) {
			//modify in app layer
			Student student = existingStudent.get();
			student.setName(updatingStudent.getName());	
			
			//save the updated record
			studentrepository.save(student);	
			
			return "Update Success";
		}
		else {
			return "Record Not Found";
		}
	}
}
