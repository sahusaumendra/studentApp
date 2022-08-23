package com.java.student.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.student.model.Student;
import com.java.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/allstudent")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents(); 
	}
	
	@GetMapping("/allstudent/{studentid}")
	public Optional<Student> getStudentsById(@PathParam("studentid")int studentid){
		return studentService.getStudentsById(studentid); 
	}
	
	@PostMapping("/savestudent")
	public String saveStudentData(@RequestBody Student student) {
		return studentService.saveStudentData(student);
	}
	
	@DeleteMapping("/deletestudent/{studentid}")
	public String deleteStudentById(@PathParam("studentid")int studentid) {
		return studentService.deleteStudentById(studentid);
	}

}
