package com.notahmed.demo.component;

import com.notahmed.demo.model.Trainer;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class HardwareTrainer implements Trainer {

    HardwareTrainer(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getSubject() {
        return "Registers & Microcontrollers";
    }
}
