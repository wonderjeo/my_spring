package aop.spring_aop_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAOP {

	@Test
	public void demo1(){
		String xml="aop/spring_aop/application.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		//获得目标类
		UserService userService = (UserService)applicationContext.getBean("userService");
		userService.addUserService();
		userService.updateUserService();
		userService.deleteUserService();
	}
}
