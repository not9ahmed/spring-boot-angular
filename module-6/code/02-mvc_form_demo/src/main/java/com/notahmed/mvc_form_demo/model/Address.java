package com.notahmed.mvc_form_demo.model;

import jakarta.validation.constraints.NotEmpty;

public class Address {

    private String street;

    @NotEmpty(message = "City is required")
    private String city;
    private String state;

    public Address() {
    }


    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
