package com.fogcoding.templates.AnnotationAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created By Andrew Duan
 * Date:2019/8/30
 * e-mail:thinfog@126.com
 */
public class Test1 {


	public static void main(String[] args) {
		Handler handler = new Handler();
		ITest test1 = (ITest) handler.newInstance(new Impl(" for one!"));
		ITest test2 = (ITest) handler.newInstance(new Impl(" for two!"));
		ITest test3 = (ITest) handler.newInstance(new Impl(" for three!"));
		test1.a("String str");
		test1.b();
		test1.c();
		test2.a("String str");
		test2.b();
		test2.c();
		test3.a("String str");
		test3.b();
		test3.c();


	}



    static class Handler implements InvocationHandler {

        private Object obj;

        public Object newInstance(Object obj) {
            this.obj = obj;
            return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(" invoke before ! ");
            if (args != null) {
                System.out.println(" args  "+args[0]);
            }
            method.invoke(obj, args);
            System.out.println(" invoke after ! ");
            return obj;
        }


    }

    static class Impl implements ITest {

        private String info;

        public Impl(String info) {
            this.info = info;
        }

        public void a(String str) {
            System.out.println("a methods runned!" + info);
        }

        public void b() {
            System.out.println("b methods runned!" + info);
        }

        public void c() {
            System.out.println("c methods runned!" + info);
        }
    }

    public interface ITest {
        void a(String str);

        void b();

        void c();
    }
}
