package com.example.Teacher.repositories;

import com.example.Teacher.entity.Teacherdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacherdata, String> {
}
