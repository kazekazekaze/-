package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
	@Id
	public Integer id;
	
	@Column(length = 64)
	public String subjectname;
	
	@Column(length = 64)
	public Integer classroom;
	
	@Column
	public Integer administrator;

	// Getter and Setter for id
    public Integer GetId() {
        return id;
    }

    public void SetId(Integer id) {
        this.id = id;
    }

    // Getter and Setter for subjectname
    public String GetSubjectname() {
        return subjectname;
    }

    public void SetSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    // Getter and Setter for classroom
    public Integer GetClassroom() {
        return classroom;
    }

    public void SetClassroom(Integer classroom) {
        this.classroom = classroom;
    }

    // Getter and Setter for administrator
    public Integer GetAdministrator() {
        return administrator;
    }

    public void SetAdministrator(Integer administrator) {
        this.administrator = administrator;
    }
}
