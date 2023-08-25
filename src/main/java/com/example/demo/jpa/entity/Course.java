package com.example.demo.jpa.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private long id;
	
	private String name;
	private LocalDateTime course_date;
	private String author;
	
	public Course() {
		
	}
	
	public Course(long id, String name, LocalDateTime course_date, String author) {
		super();
		this.id = id;
		this.name = name;
		this.course_date = course_date;
		this.author = author;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getCourse_date() {
		return course_date;
	}
	public void setCourse_date(LocalDateTime course_date) {
		this.course_date = course_date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", course_date=" + course_date + ", author=" + author + "]";
	}
	
	
}