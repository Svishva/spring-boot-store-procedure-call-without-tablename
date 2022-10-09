package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/student")
	public List<Student> getAll() {
		return studentService.getAll();
	}

	//working
	@GetMapping("/student-sp")
	public Student getAllFromSP() {
		return studentService.getAllFromSP();
	}
	
	// currently not working
	@GetMapping("/student-sp2")
	public List<Student> getAllFromSP2() {
		return studentService.getAllFromSP2();
	}

	//working
	@GetMapping("/student-sp3")
	public Student getAllFromSP3() {
		return studentService.getAllFromSP3();
	}

}
