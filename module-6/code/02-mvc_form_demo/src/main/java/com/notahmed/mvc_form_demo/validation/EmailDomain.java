package com.notahmed.mvc_form_demo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.Validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Creating custom annotation for field validation in Employee
 * Will reference the class
 */
@Constraint(validatedBy = EmailDomainConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailDomain {

//    Define default domain name
    public String value() default "email.com";

//    Define default error message
    public String message() default "Email must end with @email.com";

//    define default groups
    public Class<?>[] groups() default {};


//    define default payload
    public Class<? extends Payload>[] payload() default {};

}
