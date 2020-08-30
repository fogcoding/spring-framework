package com.fogcoding.templates.AnnotationAop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LandLordAop {

    /**
     * execution：代表执行方法的时候会触发
     * * ：代表任意返回类型的方法
     * pojo.Landlord：代表类的全限定名
     * service()：被拦截的方法名称
     */
    @Before("execution(* com.fogcoding.templates.AnnotationAop.LandLord.service())")
    public void bofore(){
        System.out.println("贴广告");
        System.out.println("邀请租户");
    }

    @After(("execution(* com.fogcoding.templates.AnnotationAop.LandLord.service())"))
    public void after(){
        System.out.println("拿提成");
        System.out.println("下一个");
    }


}
