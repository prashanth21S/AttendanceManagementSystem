package com.example.Teacher.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table 
public class Teacherdata {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String department;
    @Column
    private String designation;
	public Teacherdata()
	{
		
	}
    public Teacherdata(String string1, String string2, String string3,String string4) {
        	id=string1;
		name=string2;
		department=string3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment(){
    	return department;
    }

    public void setDepartment(String department){
    	this.department = department;
    }
    public String getDesignation(){
    	return designation;
    }

    public void setDesignation(String designation){
    	this.designation = designation;
    }

}
