package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {
	@Id
	private Integer id;
	
	@Column
	private Integer progress;
	
	@Column
	private Integer author;
	
	@Column
	private String content;

	public Integer GetId() {
		return id;
	}
	
	public void SetId(Integer id) {
		this.id = id;
	}
	
	 // Getter and Setter for progress
    public Integer GetProgress() {
        return progress;
    }

    public void SetProgress(Integer progress) {
        this.progress = progress;
    }

    // Getter and Setter for author
    public Integer GetAuthor() {
        return author;
    }

    public void SetAuthor(Integer author) {
        this.author = author;
    }

    // Getter and Setter for content
    public String GetContent() {
        return content;
    }

    public void SetContent(String content) {
        this.content = content;
    }
}
