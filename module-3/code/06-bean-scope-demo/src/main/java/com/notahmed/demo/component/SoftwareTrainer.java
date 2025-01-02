package com.notahmed.demo.component;

import com.notahmed.demo.model.Trainer;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
// Will create an object everytime
@Scope("prototype")
public class SoftwareTrainer implements Trainer {
    @Override
    public String getSubject() {
        return "Java Spring with Angular";
    }
}
