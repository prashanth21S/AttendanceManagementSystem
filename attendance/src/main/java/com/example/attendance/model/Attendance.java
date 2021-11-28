package com.example.attendance.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table

public class Attendance {
    @Id

    private String id;
    @Column
    private String day;
    @Column
    private String time;
    @Column
    private String status;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="stud_usn")
    private Student student;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="course_id")
    private Coursedata course;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="teacher_id")
    private Teacherdata teacher;



   public Attendance()
   {

   }
   public Attendance(String string1,String string2,String string3,String string4)
   {
       id=string1;
       day=string2;
       time=string3;
       status=string4;
   }

   public Student getStudent()
   {
       return student;
   }
   public void setStudent(Student student)
   {
       this.student=student;
   }
   public Coursedata getCourse()
   {
       return course;
   }
   public void setCourse(Coursedata course){
       this.course=course;
   }
   public Teacherdata getTeacher()
   {
       return teacher;
   }
   public void setTeacher(Teacherdata teacher){
       this.teacher=teacher;
   }

   public String getId()
   {
       return id;
   }

   public void setId(String id)
   {
       this.id=id;
   }
   public String getDay()
   {
       return day;
   }

   public void setDay(String day)
   {
       this.day=day;
   }
   public String getTime()
   {
       return time;
   }

   public void setTime(String time)
   {
       this.time=time;
   }
   public String getStatus()
   {
       return status;
   }

   public void setStatus(String status)
   {
       this.status=status;
   }


}
