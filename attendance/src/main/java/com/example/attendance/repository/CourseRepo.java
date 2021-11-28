package com.example.attendance.repository;

import com.example.attendance.model.Coursedata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Coursedata, String> {
}
