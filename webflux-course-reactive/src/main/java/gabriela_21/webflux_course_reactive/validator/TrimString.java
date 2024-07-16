package gabriela_21.webflux_course_reactive.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = { TrimStringValidator.class})
@Target(FIELD)
@Retention(RUNTIME)
public @interface TrimString {
    String message() default "Field cannot have blank apaces at the beginning or at end";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
