package aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyFactory {

	public static UserService createUserService(){
		//1.目标类
		UserService userService = new UserServiceImpl();
		//2.切面类
		MyAspect myAspect = new MyAspect();
		//3.代理类 将目标类（切入点）与切面类（通知）结合
		
		UserService proxyService = (UserService)Proxy.newProxyInstance(
				MyFactory.class.getClassLoader(), 
				userService.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						//将目标类和切面类结合
						myAspect.before();
						//执行目标类的方法
						method.invoke(userService, args);
						
						myAspect.after();
						return null;
					}
				});
		return proxyService;
	}
}
