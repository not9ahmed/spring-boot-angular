package com.notahmed.demo.controller;

import com.notahmed.demo.model.Trainer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // used interface implementation
    // without specifying the exact implementation
    Trainer trainer;

    DemoController(Trainer trainer){
        this.trainer = trainer;
    }

    @RequestMapping("/subject")
    public String subject(){
        return "Trainer: " + trainer.getSubject();
    }
}
