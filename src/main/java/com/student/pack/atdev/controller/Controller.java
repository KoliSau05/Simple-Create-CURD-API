package com.student.pack.atdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.pack.atdev.entity.Student;
import com.student.pack.atdev.entity.StudentRequest;
import com.student.pack.atdev.service.StudentService;


@RestController
@RequestMapping("/api/student")
public class Controller {

	@Autowired
	private StudentService serviceObj;
	
   @PostMapping("/add")
	public ResponseEntity<String> saveStudent(@RequestBody StudentRequest stud){
		Student obj =serviceObj.saveStudent(stud);
		if(obj != null) {
			return new ResponseEntity<>("Student Data Added",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Something is wrong",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
   
   @GetMapping("/get/all")
   public List<Student> findAllStudents(){
	return serviceObj.findAllStudents();
	 
   }
   
   
   @GetMapping("/get/{id}")
    public Student findStudentById(@PathVariable Long id) {
		return serviceObj.findStudentById(id);
    	
    }
   
   @PutMapping("/upadet/{id}")
   public Student updateStudent(@RequestBody StudentRequest stud, @PathVariable Long id) {
	return serviceObj.updateStudent(stud, id);
	   
   }
   
   @DeleteMapping("/delete/{id}")
   public String deleteStudent(@PathVariable Long id) {
	   serviceObj.deleteStudent(id);
	return "Studet data delete by id is "+ id;
	   
   }

}
