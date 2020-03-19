
package com.fogcoding.templates.AnnotationAop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
//import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created By Andrew Duan
 * Date:2019/8/30
 * e-mail:thinfog@126.com
 */
public class CGlibTest implements MethodInterceptor {


	@SuppressWarnings("unchecked")
    public static <T extends Father> T newProxyInstance(Class<T> father) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(father);
        enhancer.setCallback(new CGlibTest());
        return (T) enhancer.create();
    }

	public static void main(String[] args) {
		Father father = CGlibTest.newProxyInstance(Father.class);
        father.run("something!");
	}


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("stop here for a while ");
        return methodProxy.invokeSuper(o,objects);
    }

    static class Father {

        public Father() {
        }

        public void run(String content) {
            System.out.println("run content:" + content );
        }

    }

}
