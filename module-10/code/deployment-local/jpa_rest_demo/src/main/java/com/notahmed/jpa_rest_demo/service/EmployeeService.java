package com.notahmed.jpa_rest_demo.service;

import com.notahmed.jpa_rest_demo.dao.EmployeeDAO;
import com.notahmed.jpa_rest_demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

// will identify the EmployeeDAOImpl
    private final EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    public Employee findById(Integer id) {
        return employeeDAO.findById(id);
    }

    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    public void deleteById(Integer id) {
        employeeDAO.deleteById(id);
    }

}
