package com.naveencode.studentsystem.service;

import java.util.List;

import com.naveencode.studentsystem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);

	public List<Student> getAllStudents();
}
