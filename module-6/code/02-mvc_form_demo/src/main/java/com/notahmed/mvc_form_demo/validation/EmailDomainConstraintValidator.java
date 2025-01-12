package com.notahmed.mvc_form_demo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

// class to implement ConstraintValidator
public class EmailDomainConstraintValidator implements ConstraintValidator<EmailDomain, String> {


    private String domainName;


    @Override
    public void initialize(EmailDomain emailDomain) {
        domainName = emailDomain.value();
    }


    // Validation will occur here
    @Override
    public boolean isValid(String emailAddress, ConstraintValidatorContext constraintValidatorContext) {

        if (emailAddress.endsWith(domainName)) {
            return true;
        } else {
            return false;
        }
        
    }
}
