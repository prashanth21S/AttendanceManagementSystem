package com.example.attendance.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table 
public class Coursedata {
    @Id
    private String id;
    @Column
    private String name;

    @OneToOne(cascade=CascadeType.ALL,mappedBy = "course")
    private Attendance attendance;

	public Coursedata()
	{
		
	}
    public Coursedata(String string1, String string2) {
        	id=string1;
		name=string2;
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

    public Attendance getAttendance()
    {
        return attendance;
    }
    public void setAttendance(Attendance attendance){
        this.attendance=attendance;
    }

}
