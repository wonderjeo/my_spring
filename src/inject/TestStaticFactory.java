package inject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {

	@Test
	public void demo1(){
		UserService userService = MyBeanFactory.createService();
		userService.service();
	}
	
	@Test
	public void demo2(){
		String xml="/my_spring/src/inject/application.xml";
		ApplicationContext a = new ClassPathXmlApplicationContext(xml);
		UserService userService = a.getBean("userService", UserService.class);
		userService.service();
	}
}
