package com.notahmed.mvc_form_demo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Employee {

    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Gender is required")
    private String gender;

    @NotEmpty(message = "email is required")
    @Email(message = "email must be valid")
    private String email;

    @NotEmpty(message = "Department is required")
    private String department;

    private Address address;

    public Employee(String name, String gender, String email, String department) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.department = department;
    }

    public Employee() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
