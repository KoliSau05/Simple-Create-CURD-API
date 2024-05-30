package com.student.pack.atdev.service;

import java.util.List;

import com.student.pack.atdev.entity.Student;
import com.student.pack.atdev.entity.StudentRequest;

public interface StudentService {

	
	public Student saveStudent(StudentRequest stud);
	public List<Student> findAllStudents();
	public Student findStudentById(Long id);
	public Student updateStudent(StudentRequest stud , Long id);
	public void deleteStudent(Long id);
}
