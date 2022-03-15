package com.rvmagrini.springjpa.repository;

import com.rvmagrini.springjpa.model.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Course save(Course course) {
        entityManager.persist(course);
        return course;
    }

}
