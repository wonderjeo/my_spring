package aop.factory_bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {

	@Test
	public void demo1(){
		String xml="aop/factory_bean/application.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		//获得代理类
		UserService userService = (UserService)applicationContext.getBean("proxyService");
		userService.addUserService();
		userService.updateUserService();
		userService.deleteUserService();
	}
}
