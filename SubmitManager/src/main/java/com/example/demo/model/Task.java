package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	@Id
	private Integer id;
	
	@Column
	private Integer subject;
	
	@Column
	private Date deadline;
	
	@Column
	private String information;

	// Getter and Setter for id
    public Integer GetId() {
        return id;
    }

    public void SetId(Integer id) {
        this.id = id;
    }

    // Getter and Setter for subject
    public Integer GetSubject() {
        return subject;
    }

    public void SetSubject(Integer subject) {
        this.subject = subject;
    }

    // Getter and Setter for deadline
    public Date GetDeadline() {
        return deadline;
    }

    public void SetDeadline(Date deadline) {
        this.deadline = deadline;
    }

    // Getter and Setter for information
    public String GetInformation() {
        return information;
    }

    public void SetInformation(String information) {
        this.information = information;
    }
}