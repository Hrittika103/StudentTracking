package com.studentracking.service;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentracking.model.Student;
import com.studentracking.repository.StudentRepository;

@Service
public class StudentService {


	
	@Autowired
	StudentRepository dao;

	public List<Student> getAllStudent() {
		
		return dao.findAll();
	}
	
	public Student getStudentById(int id) {
		Optional<Student> student = dao.findById(id);
		return student.get();
		
	}
	
	public Student addStudent(Student student) {
		return dao.save(student);
		
	}
	
	public void deleteStudent(int id) {
		dao.deleteById(id);
		
	}
	public Student updateStudent(Student student) {
		Optional<Student> update =dao.findById(student.getId());
		Student fi = update.get();
		fi.setEmail(student.getEmail());
		
		return dao.save(student);
	}

}