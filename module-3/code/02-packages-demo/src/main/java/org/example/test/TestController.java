package org.example.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/package2")
    public String hello(){
        return "Hello from package 2 controller updated 2";
    }
}
