package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 64, nullable = false)
	private String name;
	
	@Column(length = 16, nullable = false)
	private String password;
	
	@Column(length = 1, nullable = false)
	private Integer authority;
	
	public Integer GetId() {
		return id;
	}
	
	public String GetName() {
		return name;
	}
	
	public String GetPassword() {
		return password;
	}
	
	public Integer GetAuthority() {
		return authority;
	}
	
	public void SetId(Integer id) {
		this.id = id;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public void SetPassword(String password) {
		this.password = password;
	}
	
	public void SetAuthority(Integer authority) {
		this.authority = authority;
	}
	
	public String toString() {
		return GetId() + " : " + GetName() + " : " + GetAuthority();
	}
}
