package com.fogcoding.templates.AutoInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AutoInjection.class);
		IDataImpl impl = context.getBean("mydata", IDataImpl.class);
		System.out.println(impl.showData());

		ApplicationContext context1 = new AnnotationConfigApplicationContext("AutoInjection");
		Object test = context.getBean("testBean");
		BeanTest t1 = (BeanTest) test;
		BeanTest test1 = t1.getOne();
		System.out.println(test1.test());

	}

}
