package com.example.student.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Student {
    @Id
    private String usn;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private String email;

    public Student()
    {

    }
    public Student(String usn,String name,String phone,String email)
    {  
        this.usn=usn;
        this.name=name;
        this.phone=phone;
        this.email=email;

    }

    public String getUsn()
    {
        return usn;
    }
    public void setUsn(String usn)
    {
        this.usn=usn;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    
}
