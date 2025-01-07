package com.notahmed.jpademo.dao;

import com.notahmed.jpademo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class StudentDAOImpl implements StudentDAO {

    private EntityManager entityManager;

    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // call entityManager to save the record to DB
    @Override
    @Transactional
    public void save(Student newStudent) {
        entityManager.persist(newStudent);
    }

    // call entityManger to retrieve a student from db
    @Override
    public Student findById(Integer id) {
        Student student = entityManager.find(Student.class, id);
        return student;
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("FROM Student", Student.class).getResultList();
    }

    @Override
    @Transactional
    public void update(Student updatedStudent) {
        entityManager.merge(updatedStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student tempStudent = entityManager.find(Student.class, id);
        entityManager.remove(tempStudent);
    }


}
