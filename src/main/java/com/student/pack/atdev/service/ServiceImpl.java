package com.student.pack.atdev.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.student.pack.atdev.entity.Student;
import com.student.pack.atdev.entity.StudentRequest;
import com.student.pack.atdev.repository.StudentRepository;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	StudentRepository repo;
	
	@Override
	public Student saveStudent(StudentRequest stud) {
		Student obj = new Student();
		obj.setStudentName(stud.getStudentName());
		obj.setDepartment(stud.getDepartment());
		obj.setStudentAge(stud.getStudentAge());
		obj.setAddress(stud.getAddress());
		obj.setMobileNo(stud.getMobileNo());
		return repo.save(obj);
	}

	@Override
	public List<Student> findAllStudents() {
		List<Student> list =  repo.findAll();
		return list;
	}

	@Override
	public Student findStudentById(Long id) {
		Optional<Student> opObj = repo.findById(id);		
		if(opObj.isPresent()) {
			return opObj.get();
		}else {
			return new Student();
		}
	}

	@Override
	public Student updateStudent(StudentRequest stud, Long id) {
		Student obj = repo.findById(id).get();
		if(Objects.nonNull(stud.getAddress()) && !"".equalsIgnoreCase
				(stud.getAddress())){
					obj.setAddress(stud.getAddress());;
				}
		if(Objects.nonNull(stud.getDepartment()) && !"".equalsIgnoreCase(stud.getDepartment())){
			obj.setDepartment(stud.getDepartment());
		}
		if(Objects.nonNull(stud.getMobileNo())){
			obj.setMobileNo(stud.getMobileNo());
		}
		return repo.save(obj);
	}

	@Override
	public void deleteStudent(Long id) {
		repo.deleteById(id);
	}

}
