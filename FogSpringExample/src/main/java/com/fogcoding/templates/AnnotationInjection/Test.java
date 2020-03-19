package com.fogcoding.templates.AnnotationInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Animal animal = context.getBean("animal111", Animal.class);
		System.out.println(animal.getName());
		System.out.println(animal.getPrice());


	}


}
