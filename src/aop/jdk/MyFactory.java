package aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyFactory {

	public static UserService createUserService(){
		//1.Ŀ����
		UserService userService = new UserServiceImpl();
		//2.������
		MyAspect myAspect = new MyAspect();
		//3.������ ��Ŀ���ࣨ����㣩�������֪ࣨͨ�����
		
		UserService proxyService = (UserService)Proxy.newProxyInstance(
				MyFactory.class.getClassLoader(), 
				userService.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						//��Ŀ�������������
						myAspect.before();
						//ִ��Ŀ����ķ���
						method.invoke(userService, args);
						
						myAspect.after();
						return null;
					}
				});
		return proxyService;
	}
}
