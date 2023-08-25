package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dataJpa.CourseDataJpaRepository;
import com.example.demo.jdbc.CourseJdbcRepository;
import com.example.demo.jdbc.entity.Course;
import com.example.demo.jpa.CourseJpaRepository;
import com.example.demo.jpa.TableXJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	//@Autowired
	//private CourseJdbcRepository cr;
	
	//@Autowired
	//private CourseJpaRepository cr;
	

	@Autowired
	private CourseDataJpaRepository cr;
	
	@Override
	public void run(String... args) throws Exception {
		com.example.demo.jpa.entity.Course c = new com.example.demo.jpa.entity.Course();
		c.setId(2);
		c.setCourse_date(LocalDateTime.now());
		c.setAuthor("Luigi");
		c.setName("Imparare la bicicletta");
		cr.save(c);
		
		c.setId(3);
		c.setCourse_date(LocalDateTime.now());
		c.setAuthor("Babu");
		c.setName("Imparare a correre");
		cr.save(c);
		
		//tx.findById(0);
		
	}

}
