package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * @author Treasure baby
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRequestMapping {
    String value() default "";
}
