package com.example.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class Coursedata {
    @Id
    private String id;
    @Column
    private String name;
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

}
