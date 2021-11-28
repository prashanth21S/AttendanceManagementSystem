package com.example.attendance.repository;
import com.example.attendance.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<Student,String>{
    
}
