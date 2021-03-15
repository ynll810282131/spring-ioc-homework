package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * @author Treasure baby
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Security {
    String[] value();
}
