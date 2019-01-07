package aop.factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before:");
		//�ֶ�ִ��Ŀ�귽��
		Object obj = arg0.proceed();
		
		System.out.println("After:");
		return obj;
	}

}
