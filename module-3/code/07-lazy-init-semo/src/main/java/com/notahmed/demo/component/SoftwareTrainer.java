package com.notahmed.demo.component;

import com.notahmed.demo.model.Trainer;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class SoftwareTrainer implements Trainer {

    SoftwareTrainer() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void initStuff() {
        System.out.println("In initStuff: " + getClass().getSimpleName());
    }

    @Override
    public String getSubject() {
        return "Java Spring with Angular";
    }

    @PreDestroy
    public void cleanUpStuff() {
        System.out.println("In cleanUpStuff: " + getClass().getSimpleName());
    }
}
