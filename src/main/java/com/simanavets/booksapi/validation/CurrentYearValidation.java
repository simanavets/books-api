package com.simanavets.booksapi.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Year;

public class CurrentYearValidation implements ConstraintValidator<NotLater, Integer> {
    
    @Override
    public void initialize(NotLater constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        int currentYear = Year.now().getValue();
        return (currentYear == value || currentYear > value);
    }
}
