package com.example.demo.jpa.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TableY {
	@Id
	private long id;
	
	private String pippo;
	private LocalDate birthdate;

}
