package com.example.student.service;

import org.springframework.stereotype.Service;

import com.example.student.model.Student;

import com.example.student.repository.StudentRepository;

import java.util.List;


@Service
public class StudentService {


    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;

    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student getStudent(String usn)
    {
        return studentRepository.findById(usn).orElse(null);
    }
    public Student create(Student student)
    {
        return studentRepository.save(student);
    }
    public void delete(String usn)
    {
        studentRepository.deleteById(usn);
    }
    public Student update(Student student,String usn)
    {
        Student stud=studentRepository.findById(usn).get();
        stud.setEmail(student.getEmail());
        stud.setName(student.getName());
        stud.setPhone(student.getPhone());
        stud.setUsn(student.getUsn());
        studentRepository.save(stud);
        return stud;
    }

    public void deleteAll()
    {
        studentRepository.deleteAll();
    }

}
