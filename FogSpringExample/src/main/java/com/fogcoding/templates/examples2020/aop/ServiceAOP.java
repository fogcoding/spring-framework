package com.fogcoding.templates.examples2020.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/8/30 22:20
 * @e-mail: thinfog@126.com
 */
@Component
@Aspect
public class ServiceAOP {

	@Before("execution(* com.fogcoding.templates.examples2020.service.ExampleServiceImpl.service1(..))")
	public void before(){
	    System.out.println("before service run");
	}

	@After("execution(* com.fogcoding.templates.examples2020.service.ExampleServiceImpl.service1(..))")
	public void after(){
	    System.out.println("after service run");
	}




}
