package com.notahmed.mvc_demo.controller;

import com.notahmed.mvc_demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String showHome(Model model) {

//        Will search for file named home
        return "home";
    }


    // Model can be used by the template to pass dynamic data
    @RequestMapping("/about")
    public String showAbout(Model model) {
        model.addAttribute("first_name", "Ahmed");
        model.addAttribute("last_name", "Not");
        model.addAttribute("age", 99);

        String[] names = {"Ahmed", "Joe", "Steve", "Ann"};

        model.addAttribute("names", names);


//        Passing a class
        Person ahmed = new Person("Ahmed", "ahmed.gmail.com", 999.99);
        model.addAttribute("person", ahmed);

//        Passing list of object
        Person[] employees = {
                new Person("Joe", "joe@gmail,.com", 500),
                new Person("John", "john@gmail,.com", 699),
                new Person("Steve", "steve@gmail,.com", 899),
        };

        model.addAttribute("employees", employees);


        return "about";
    }

}
