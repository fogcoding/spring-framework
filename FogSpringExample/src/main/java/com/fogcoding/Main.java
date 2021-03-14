package com.fogcoding;

import com.fogcoding.entity.PoJo;
import com.fogcoding.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("Running~!");

		AnnotationConfigApplicationContext configApplicationContext
				= new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("中文输出测试！");

		System.out.println(configApplicationContext.getBean(User.class).toString());
		System.out.println(configApplicationContext.getBean(PoJo.class).toString());



	}

}
