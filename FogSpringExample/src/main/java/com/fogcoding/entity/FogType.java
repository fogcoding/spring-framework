package com.fogcoding.entity;

import com.fogcoding.annotation.Fog;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2021/3/14 19:44
 * @e-mail: thinfog@126.com
 */

@Component
public class FogType {

	@Fog("测试注解消息解析11111111111111111")
	private String msg;


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
