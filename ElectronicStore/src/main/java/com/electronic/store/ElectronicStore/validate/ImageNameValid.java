package com.electronic.store.ElectronicStore.validate;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import lombok.experimental.FieldNameConstants;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ImageNameValidator.class)
public @interface ImageNameValid {
    //error message
    String message() default "{jakarta.validation.constraints.NotBlank.message}";

    //represent group of constarint
    Class<?>[] groups() default {};

    //additional information
    Class<? extends Payload>[] payload() default {};
}
