package com.example.course.controller;

import com.example.course.entity.Coursedata;
import com.example.course.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/getAllCourses")
    public List<Coursedata> getAllCoursedatas() {
        return courseService.getAllCourses();
    }

    @GetMapping("/getById/{id}")
    public Coursedata getCoursedata(@PathVariable String id) {
        return courseService.getCoursedataById(id);
    }

    @PostMapping("/createCourse")
    public Coursedata createCoursedata(@RequestBody Coursedata course) {
        return courseService.create(course);
    }

    @DeleteMapping("/deleteCoursedata/{id}")
    public String deleteCoursedata(@PathVariable String id) {
        courseService.delete(id);
        return "Course Deleted";
    }

    @PutMapping("/updateCoursedata/{id}")
    public Coursedata updateCoursedata(@RequestBody Coursedata course, @PathVariable String id) {
        return courseService.update(course, id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteCousedatas() {
        courseService.deleteAll();
        return "All courses data deleted";
    }
}
