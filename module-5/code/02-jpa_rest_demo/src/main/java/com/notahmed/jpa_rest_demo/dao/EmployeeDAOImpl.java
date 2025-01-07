package com.notahmed.jpa_rest_demo.dao;

import com.notahmed.jpa_rest_demo.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeDAOImpl implements EmployeeDAO {

    private final EntityManager entityManager;

    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = entityManager.createQuery("FROM Employee", Employee.class).getResultList();
        return employees;
    }

    @Override
    public Employee findById(Integer id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}
