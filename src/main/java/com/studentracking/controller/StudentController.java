package com.studentracking.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentracking.model.Student;
import com.studentracking.service.StudentService;


@RequestMapping("/web")
@RestController
public class StudentController {



	
	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public List<Student> getStudent(){
		return service.getAllStudent();
		
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}

	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
		
	}
	
	@GetMapping("/students/afterDelete/{id}")
	public List<Student> deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
		return service.getAllStudent();
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student s) {
		return service.updateStudent(s);
		
	}
}

