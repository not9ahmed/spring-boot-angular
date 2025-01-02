package com.notahmed.demo.component;

import com.notahmed.demo.model.Trainer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class HardwareTrainer implements Trainer {
    @Override
    public String getSubject() {
        return "Registers & Microcontrollers";
    }
}
