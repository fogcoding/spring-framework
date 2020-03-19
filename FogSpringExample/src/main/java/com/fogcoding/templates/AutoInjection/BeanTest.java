package com.fogcoding.templates.AutoInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeanTest {

    static Animal animal = new Animal();

    //要返回的类型里面存在init方法，才能在Bean里面进行注解
    @Bean(name="testBean",initMethod = "init",destroyMethod = "destory")
    public BeanTest getOne() {
        BeanTest res = new BeanTest();
        return res;
    }

    public void init(){
        System.out.println("init");
        animal.setName("eagle");
        animal.setPrice("3100");
    }

    public void destory(){
        System.out.println("destory");
        animal.setName("eagle");
        animal.setPrice("3100");
    }

    public String test(){
        System.out.println("test methods!");
        return "test @bean annotation!   animal name="+animal.getName()+"-- price="+animal.getPrice();
    }






}
