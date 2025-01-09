package com.notahmed.mvc_form_demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping
    public String showHome(Model model) {
        return "index";
    }
}
