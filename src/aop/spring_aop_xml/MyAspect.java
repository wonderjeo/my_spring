package aop.spring_aop_xml;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before:");
		//手动执行目标方法
		//
		Object obj = arg0.proceed();
		
		System.out.println("After:");
		return obj;
	}

}
