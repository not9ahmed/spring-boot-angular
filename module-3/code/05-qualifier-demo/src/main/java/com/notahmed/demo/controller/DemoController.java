package com.notahmed.demo.controller;

import com.notahmed.demo.model.Trainer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // used interface implementation
    // without specifying the exact implementation
    Trainer trainer;


    // @Qualifier can be use find the exact interface implementation
    // Has higher priority than @Primary
    DemoController(@Qualifier("hardwareTrainer") Trainer trainer){
        this.trainer = trainer;
    }

    @RequestMapping("/subject")
    public String subject(){
        return "Trainer: " + trainer.getSubject();
    }
}
