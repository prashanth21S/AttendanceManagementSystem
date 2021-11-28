package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@RequestMapping("/student")
@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/get/{usn}")
    public Student getStudent(@PathVariable String usn) {
        return studentService.getStudent(usn);
    }

    @PostMapping("/createStudent")
    public Student createBook(@RequestBody Student student) {
        return studentService.create(student);
    }

    @DeleteMapping("/deleteStudent/{usn}")
    public String deleteStudent(@PathVariable String usn) {
        studentService.delete(usn);
        return "Student Deleted";
    }

    @PutMapping("/updateStudent/{usn}")
    public Student updateBook(@RequestBody Student student, @PathVariable String usn) {
        return studentService.update(student, usn);
    }

    @DeleteMapping("/deleteAll")
    public String deleteBooks() {
        studentService.deleteAll();
        return "All Students data deleted";
    }
    
}
