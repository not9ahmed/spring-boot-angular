package com.notahmed.jpa_rest_demo.dao;

import com.notahmed.jpa_rest_demo.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(Integer id);
    Employee save(Employee employee);
    void deleteById(Integer id);
}
