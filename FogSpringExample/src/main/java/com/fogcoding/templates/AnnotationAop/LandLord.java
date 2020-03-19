package com.fogcoding.templates.AnnotationAop;

import org.springframework.stereotype.Component;

//@Component("landlord")
public class LandLord {

	public void service(){
        //core business
        System.out.println("提供验货");
        System.out.println("大手收钱");
    }


}
