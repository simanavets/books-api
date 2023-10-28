package com.simanavets.booksapi.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
@Constraint(validatedBy = CurrentYearValidation.class)
public @interface NotLater {
    String message() default "Year can not be later than the current one";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
