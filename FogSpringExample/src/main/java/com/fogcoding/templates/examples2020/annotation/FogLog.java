package com.fogcoding.templates.examples2020.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/8/30 22:47
 * @e-mail: thinfog@126.com
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FogLog {
	/**
	 * 个人日志记录的注解
	 */
}
