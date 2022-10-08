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

	@GetMapping("/student-sp")
	public Student getAllFromSP() {
		return studentService.getAllFromSP();
	}

	@GetMapping("/student-sp2")
	public List<Student> getAllFromSP2() {
		return studentService.getAllFromSP2();
	}

}
