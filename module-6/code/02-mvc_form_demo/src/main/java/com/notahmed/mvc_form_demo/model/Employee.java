package com.notahmed.mvc_form_demo.model;

import com.notahmed.mvc_form_demo.validation.EmailDomain;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public class Employee {

    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Gender is required")
    private String gender;

    @NotEmpty(message = "email is required")
    @Email(message = "email must be valid")
    @EmailDomain(value = "company.com", message = "Email must be company.com")
    private String email;


    @NotEmpty(message = "Mobile is required")
    @Pattern(regexp = "^[0-9]{10}", message = "Mobile number must be 10 digits")
    private String mobile;


    @NotEmpty(message = "Department is required")
    private String department;


//    Adding constraints for number type
    @NotNull(message = "Salary is required")
    @Min(value = 0, message = "Salary must be positive")
    @Max(value = 4000, message = "Salary must not be greater than 4000")
    private Double salary;


//    Adding validation to the nested address model
    @Valid
    private Address address;


    public Employee() {
    }

    public Employee(String name, String gender, String email, String mobile, String department, Double salary, Address address) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.mobile = mobile;
        this.department = department;
        this.salary = salary;
        this.address = address;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
