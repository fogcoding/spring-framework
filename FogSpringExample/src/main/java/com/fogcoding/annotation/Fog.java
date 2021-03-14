package com.fogcoding.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2021/3/14 19:37
 * @e-mail: thinfog@126.com
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fog {
	String value() default "";

}
