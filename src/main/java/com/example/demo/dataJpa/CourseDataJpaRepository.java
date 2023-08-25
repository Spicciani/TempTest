package com.example.demo.dataJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.entity.Course;

public interface CourseDataJpaRepository extends JpaRepository<Course, Long> {

}
