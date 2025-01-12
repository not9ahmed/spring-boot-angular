package com.notahmed.mvc_form_demo.controller;

import com.notahmed.mvc_form_demo.model.Address;
import com.notahmed.mvc_form_demo.model.Employee;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/employees/register")
    public String showForm(Model model) {

//        Nested object as a form
        Employee employee = new Employee();
        employee.setAddress(new Address());


        model.addAttribute("employee", employee);


        String[] departments = {
                "IT",
                "HR",
                "Accounts"
        };

        model.addAttribute("departments", departments);
        return "employee-form";
    }


//    passing the employee object from the form page
    @PostMapping("/employees/save")
    public String saveEmployee(@Valid @ModelAttribute Employee employee, BindingResult result, Model model) {

        if(result.hasErrors()) {
            String[] departments = {
                    "IT",
                    "HR",
                    "Accounts"
            };

            model.addAttribute("departments", departments);
            return "employee-form";
        }

        model.addAttribute("employee", employee);

        return "employee-success";
    }

}
