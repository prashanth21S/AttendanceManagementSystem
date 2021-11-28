package com.example.Teacher.controller;

import com.example.Teacher.entity.Teacherdata;
import com.example.Teacher.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/teacher")
@RestController
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/getAllTeachers")
    public List<Teacherdata> getAllStuddatas() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/getById/{id}")
    public Teacherdata getTeacherdata(@PathVariable String id) {
        return teacherService.getTeacherdataById(id);
    }

    @PostMapping("/createTeacher")
    public Teacherdata createTeacherdata(@RequestBody Teacherdata teacher) {
        return teacherService.create(teacher);
    }

    @DeleteMapping("/deleteTeacherdata/{id}")
    public String deleteTeacherdata(@PathVariable String id) {
        teacherService.delete(id);
        return "Teacher Deleted";
    }

    @PutMapping("/updateTeacherdata/{id}")
    public Teacherdata updateTeacherdata(@RequestBody Teacherdata teacher, @PathVariable String id) {
        return teacherService.update(teacher, id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteTeacherdatas() {
        teacherService.deleteAll();
        return "All Teachers data deleted";
    }
}
