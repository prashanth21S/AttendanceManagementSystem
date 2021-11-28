package com.example.course.service;

import com.example.course.entity.Coursedata;
import com.example.course.repositories.CourseRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepo courseRepository;

    public CourseService(CourseRepo courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Coursedata> getAllCourses() {
        return courseRepository.findAll();
    }

    public Coursedata getCoursedataById(String id) {
        return courseRepository.findById(id).orElse(null);
    }


    public Coursedata create(Coursedata course) {
        return courseRepository.save(course);
    }

    public void delete(String id) {
        courseRepository.deleteById(id);
    }

    public Coursedata update(Coursedata c, String id) {
        Coursedata c1 = courseRepository.findById(id).get();
        c1.setName(c.getName());
        courseRepository.save(c1);
        return c1;
    }

    public void deleteAll() {
        courseRepository.deleteAll();
    }
}
