package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "classroom")
public class Classroom {
	@Id
	private Integer id;
	
	@Column(nullable = false, length = 64)
	private String classname;
	
	@Column(nullable = false)
	private Integer account;
	
	public Integer GetId() {
		return id;
	}
	
	public String GetClassname() {
		return classname;
	}
	
	public Integer GetAccountId() {
		return account;
	}
	
	public void SetId(Integer classroomId) {
		this.id = classroomId;
	}
	
	public void SetClassname(String classname) {
		this.classname = classname;
	}
	
	public void SetAccountId(Integer accountId) {
		this.account = accountId;
	}
	
	public String toString() {
		return GetAccountId() + " : " + GetClassname();
	}
}
