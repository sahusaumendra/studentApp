package com.java.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.student.model.Student;
import com.java.student.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepo;
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}

	public String saveStudentData(Student student) {
		Student st = studentRepo.save(student);
		if(st != null)
			return "Student sucessfully saved.";
		else
		 return "Failed to save Student data." ;
	}

	public String deleteStudentById(int studentid) {
		studentRepo.deleteById(studentid);
		return "Student data sucessfully deleted.";
	}

	public Optional<Student> getStudentsById(int studentid) {
		return studentRepo.findById(studentid);
	}

}
