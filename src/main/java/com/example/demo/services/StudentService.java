package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	public Student getAllFromSP() {
		var s = studentRepository.getAllFromSP(5);
		s.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey() + ":" + e.getValue());
		});

		final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
		final Student pojo = mapper.convertValue(s, Student.class);
		System.out.println("s :" + pojo);
		return pojo;
	}

	public List<Student> getAllFromSP2() {
		var s = studentRepository.getAllFromSP2(5);
		System.out.println(s);
		return null;
	}

	public Student getAllFromSP3() {
		var s = studentRepository.getAllFromSP3(5);
		System.out.println(s);
		return s;
	}

}
