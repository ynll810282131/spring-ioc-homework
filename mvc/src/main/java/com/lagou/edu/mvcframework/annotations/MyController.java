package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * @author Treasure baby
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyController {
    String value() default "";
}
