package com.example.Teacher.service;

import com.example.Teacher.entity.Teacherdata;
import com.example.Teacher.repositories.TeacherRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepo teacherRepository;

    public TeacherService(TeacherRepo teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacherdata> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacherdata getTeacherdataById(String id) {
        return teacherRepository.findById(id).orElse(null);
    }


    public Teacherdata create(Teacherdata teacher) {
        return teacherRepository.save(teacher);
    }

    public void delete(String id) {
        teacherRepository.deleteById(id);
    }

    public Teacherdata update(Teacherdata t, String id) {
        Teacherdata t1 = teacherRepository.findById(id).get();
        t1.setName(t.getName());
        t1.setDepartment(t.getDepartment());
	    t1.setDesignation(t.getDesignation());
        teacherRepository.save(t1);
        return t1;
    }

    public void deleteAll() {
        teacherRepository.deleteAll();
    }
}
