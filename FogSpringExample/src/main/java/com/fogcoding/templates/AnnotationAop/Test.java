package com.fogcoding.templates.AnnotationAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created By Andrew Duan
 * Date:2019/8/13
 * e-mail:thinfog@126.com
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.fogcoding.templates.AnnotationAop");

		LandLord landLord = (LandLord) context.getBean("landlord");
		landLord.service();

//        AspectJProxyFactory factory = new AspectJProxyFactory();
//        factory.setTarget(landLord);
//        factory.addAspect(LandLordAop.class);
//        LandLord l1 = factory.getProxy();
//        l1.service();



//        fog f = new fog();
//        I i = (I) f.newProxyInstance(new Test.obj());
//        System.out.println("num:  "+i.s(200));
//        LandLordAop aop = new LandLordAop();
//        System.out.println(Arrays.toString(Proxy.class.getInterfaces()));


	}




    class fog implements InvocationHandler{

        // 目标对象
        private Object targetObject;
        //绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke方法。
        public Object newProxyInstance(Object targetObject){
            this.targetObject=targetObject;
            //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
            //第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
            //第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
            //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
            //根据传入的目标返回一个代理对象
            return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                    targetObject.getClass().getInterfaces(),this);
        }

        //关联的这个实现类的方法被调用时将被执行
        /*InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数*/
        public Object invoke(Object proxy, Method method, Object[] args)
                throws Throwable {
            System.out.println("start-->>");
            for(int i=0;i<args.length;i++){
                System.out.println(args[i]);
            }
            Object ret=null;
            try{
                /*原对象方法调用前处理日志信息*/
                System.out.println("satrt-->>");

                //调用目标方法
                ret=method.invoke(targetObject, args);
                /*原对象方法调用后处理日志信息*/
                System.out.println("success-->>");
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("error-->>");
                throw e;
            }
            return ret;
        }
    }


    class obj implements I{
        int num = 10;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String s(int code) {
            return "num="+getNum()+"code="+code;
        }
    }

    interface I{
        String s(int code);
    }


}
