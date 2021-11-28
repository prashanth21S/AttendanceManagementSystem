package com.example.course.repositories;

import com.example.course.entity.Coursedata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Coursedata, String> {
}
