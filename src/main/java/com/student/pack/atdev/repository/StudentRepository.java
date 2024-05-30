package com.student.pack.atdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.pack.atdev.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student ,Long > {

}
