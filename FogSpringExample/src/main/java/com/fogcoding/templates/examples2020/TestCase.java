package com.fogcoding.templates.examples2020;

import com.fogcoding.templates.AnnotationAop.LandLord;
import com.fogcoding.templates.examples2020.service.ExampleService;
import com.fogcoding.templates.examples2020.service.ExampleServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/8/30 22:18
 * @e-mail: thinfog@126.com
 */
public class TestCase {

	/**
	 * 动态代理来自于接口代理和父类代理，但这是动态代理的功能逻辑
	 * AOP是针对于某个接口的增强，这是自己独立的功能，虽然可以和动态代理结合使用，
	 * 但千万不要搞混淆了，他们是两个东西。
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		ExampleServiceImpl service = (ExampleServiceImpl) context.getBean("example");
//		service.service1("test msg");

		/**
		 * 定义一个注解然后直接增强方法是个相当不错的功能，
		 * 可以多去训练一下，能够实现相当复杂的功能
		 */
		ExampleService service1 = (ExampleService) context.getBean("foglog");
		service1.service1("foglog msg");


	}

}
