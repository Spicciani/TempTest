package com.example.demo.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TableX {
	@Id
	private long id;

	private String code;
	
	public TableX() {
		
	}
	
	public TableX(long id, String code) {
		super();
		this.id = id;
		this.code = code;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}
