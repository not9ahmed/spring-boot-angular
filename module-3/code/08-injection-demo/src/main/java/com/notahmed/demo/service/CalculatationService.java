package com.notahmed.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatationService {

    public double totalPrice(double price, double quantity, double discount){

        return price * quantity - discount;
    }
}
