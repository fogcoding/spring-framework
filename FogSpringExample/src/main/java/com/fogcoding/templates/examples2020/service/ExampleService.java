package com.fogcoding.templates.examples2020.service;


import com.fogcoding.templates.examples2020.annotation.FogLog;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/8/30 22:19
 * @e-mail: thinfog@126.com
 */
@Component("foglog")
public class ExampleService {

	@FogLog
	public void service1(String msg){
		System.out.println("ExampleService.service1 FogLog test get msg:" + msg );
	};

}
