package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "progress")
public class Progress {
	@Id
	private Integer id;
	
	@Column
	private Integer subject;
	
	@Column
	private Integer tragetaccount;
	
	@Column
	private Boolean checked;

	// Getter and Setter for subject
    public Integer GetSubject() {
        return subject;
    }

    public void SetSubject(Integer subject) {
        this.subject = subject;
    }

    public Integer GetTragetaccount() {
        return tragetaccount;
    }

    public void SetTragetaccount(Integer tragetaccount) {
        this.tragetaccount = tragetaccount;
    }

    public Boolean GetChecked() {
        return checked;
    }

    public void SetChecked(Boolean checked) {
        this.checked = checked;
    }
}
