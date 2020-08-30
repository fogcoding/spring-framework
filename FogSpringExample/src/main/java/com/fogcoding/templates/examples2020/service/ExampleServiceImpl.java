package com.fogcoding.templates.examples2020.service;

import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/8/30 22:36
 * @e-mail: thinfog@126.com
 */
@Component("example")
public class ExampleServiceImpl {

	public void service1(String msg) {
		System.out.println("ExampleService.service1 get msg:" + msg );
	}

}
