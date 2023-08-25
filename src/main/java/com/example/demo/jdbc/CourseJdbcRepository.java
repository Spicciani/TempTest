package com.example.demo.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.jdbc.entity.Course;



@Component
@Repository
public class CourseJdbcRepository {
	private final static String SQL_INSERT =
			"""
			insert into COURSE (id, name, course_date, author) values (?, ?, ?, ?);
			""";

	@Autowired
	JdbcTemplate myTemplate;
	
	public void insert(Course course) {
		myTemplate.update(SQL_INSERT, course.getId(), course.getName(), course.getCourse_date(), course.getAuthor());
	}
	
}
