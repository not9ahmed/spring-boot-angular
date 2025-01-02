package com.notahmed.packages_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping
    public String hello(){
        return "Hello from demo controller";
    }
}
