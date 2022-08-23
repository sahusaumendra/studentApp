package com.java.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
