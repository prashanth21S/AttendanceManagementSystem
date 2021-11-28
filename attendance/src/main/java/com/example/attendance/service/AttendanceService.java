package com.example.attendance.service;

import org.springframework.stereotype.Service;

import java.util.List;

import com.example.attendance.model.Attendance;
import com.example.attendance.model.Coursedata;
import com.example.attendance.model.Teacherdata;
import com.example.attendance.repository.AttendanceRepository;

@Service
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public AttendanceService(AttendanceRepository attendanceRepository)
    {
        this.attendanceRepository=attendanceRepository;
    }
    public List<Attendance> getAllAttendance()
    {
        return attendanceRepository.findAll();
    }
    public Attendance getAttendance(String id)
    {
        return attendanceRepository.findById(id).orElse(null);
    }
    public Attendance create(Attendance attendance)
    {
        return attendanceRepository.save(attendance);
    }
    public void delete(String id)
    {
        attendanceRepository.deleteById(id);
    }
    public Attendance update(Attendance attendance,String id)
    {
        Attendance attend=attendanceRepository.findById(id).get();
        attend.setDay(attendance.getDay());
        attend.setTime(attendance.getTime());
        attend.setStatus(attendance.getStatus());
        attend.setStudent(attendance.getStudent());
        attend.setCourse(attendance.getCourse());
        attend.setTeacher(attendance.getTeacher());
        attendanceRepository.save(attend);
        return attend;
    }

    public void deleteAll()
    {
        attendanceRepository.deleteAll();
    }
}
