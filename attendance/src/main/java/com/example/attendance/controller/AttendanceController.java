package com.example.attendance.controller;

import com.example.attendance.service.AttendanceService;
import com.example.attendance.model.Student;
import com.example.attendance.model.Teacherdata;
import com.example.attendance.model.Attendance;
import com.example.attendance.service.AttendanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/attendance")
@RestController
public class AttendanceController {
    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService){
        this.attendanceService=attendanceService;
    }
    @GetMapping("/getAllAttendance")
    public List<Attendance> getAllAttendance() {
        return attendanceService.getAllAttendance();
    }

    @GetMapping("/get/{id}")
    public Attendance getStudent(@PathVariable String id) {
        return attendanceService.getAttendance(id);
    }

    @PostMapping("/createAttendance")
    public Attendance createAttendance(@RequestBody Attendance attendance) {
        return attendanceService.create(attendance);
    }

    @DeleteMapping("/deleteAttendance/{id}")
    public String deleteAttendance(@PathVariable String id) {
        attendanceService.delete(id);
        return "Student Deleted";
    }

    @PutMapping("/updateAttendance/{id}")
    public Attendance updateAttendance(@RequestBody Attendance attendance, @PathVariable String id) {
        return attendanceService.update(attendance, id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllAttendance() {
        attendanceService.deleteAll();
        return "All attendance data deleted";
    }
    
}
