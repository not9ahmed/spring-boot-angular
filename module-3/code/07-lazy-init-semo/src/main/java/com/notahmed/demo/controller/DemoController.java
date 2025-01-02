package com.notahmed.demo.controller;

import com.notahmed.demo.model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // used interface implementation
    // without specifying the exact implementation
    Trainer trainer;

//    @Autowired
    Trainer anotherTrainer;

    DemoController(@Qualifier("softwareTrainer") Trainer trainer){
        this.trainer = trainer;
    }

    @RequestMapping("/subject")
    public String subject(){
        return "Trainer: " + trainer.getSubject();
    }

    @RequestMapping("/check")
    public String check(){
        return "Check: " + trainer.getClass().getSimpleName();
    }

    // Setter injection
    @Autowired
    public void setAnotherTrainer(@Qualifier("hardwareTrainer") Trainer anotherTrainer) {
        this.anotherTrainer = anotherTrainer;
    }


    // Setter injection
    // It is lazy
//    @Autowired
    @RequestMapping("/hardware")
    public String hardware(){

        return "Trainer: " + anotherTrainer.getSubject();
    }

}
