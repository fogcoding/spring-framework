package com.fogcoding.postProcessor;

import com.fogcoding.annotation.Fog;
import com.fogcoding.entity.FogType;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2021/3/14 19:39
 * @e-mail: thinfog@126.com
 */
@Component
public class postFogBeanProcessor implements BeanPostProcessor  {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

//		System.out.println(beanName);

		Class<?> clz = bean.getClass();
		Field[] fields = clz.getDeclaredFields();
		for (Field f:fields){
			Fog fog ;
			if ( (fog = f.getAnnotation(Fog.class)) != null){
				System.out.println("找到了自己定义的注解内容" + beanName);
				FogType fogType = (FogType) bean;
				fogType.setMsg(fog.value());
			}
		}
		/**
		 * 目前反射的基础不是太好，需要从反射开始学起！
		 * 针对不通的注解位置和注解方式，需要有不通的解析办法
		 */



		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
