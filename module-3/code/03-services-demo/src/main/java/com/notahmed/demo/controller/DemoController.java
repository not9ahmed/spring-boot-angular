package com.notahmed.demo.controller;

import com.notahmed.demo.service.CalculatationService;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    CalculatationService calculatationService;

    // Constructor injection
    public DemoController(CalculatationService calculatationService ){
        this.calculatationService = calculatationService;
    }

    @RequestMapping("")
    public String home() {
        return "Working with controller and services";
    }

    @RequestMapping("/total")
    public String totalPrice() {

        var result = calculatationService.totalPrice(120, 2,10);
        return "Result is "+result;
    }
}
