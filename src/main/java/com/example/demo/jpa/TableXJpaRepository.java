package com.example.demo.jpa;

import org.springframework.stereotype.Repository;

import com.example.demo.jpa.entity.Course;
import com.example.demo.jpa.entity.TableX;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository	
@Transactional
public class TableXJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	public TableX findById(long id) {
		return entityManager.find(TableX.class, id);
	}

	public void deleteById(long id) {
		TableX course = findById(id);
		entityManager.remove(course);
	}
}
