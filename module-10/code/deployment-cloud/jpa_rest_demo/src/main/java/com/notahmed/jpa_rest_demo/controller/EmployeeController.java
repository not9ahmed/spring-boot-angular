package com.notahmed.jpa_rest_demo.controller;

import com.notahmed.jpa_rest_demo.entity.Employee;
import com.notahmed.jpa_rest_demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {

        // So that a new record is created
        employee.setId(null);
        Employee employeeSaved = employeeService.save(employee);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(employeeSaved);
    }


    @GetMapping("")
    public ResponseEntity<List<Employee>> findAllEmployees() {
        List<Employee> employees = employeeService.findAll();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable("id") Integer id) {
        Employee employee = employeeService.findById(id);
        return ResponseEntity.ok(employee);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Integer id,
                                                   @RequestBody Employee employee) {
        employee.setId(id);
        Employee employeeUpdated = employeeService.save(employee);
        return ResponseEntity.ok(employeeUpdated);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {

        employeeService.deleteById(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
