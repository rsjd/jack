package com.rajasekar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajasekar.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
