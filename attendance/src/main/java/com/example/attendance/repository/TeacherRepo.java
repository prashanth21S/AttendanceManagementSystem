package com.example.attendance.repository;

import com.example.attendance.model.Teacherdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacherdata, String> {
}
