package factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {

//	@Test
//	public void demo1(){
//		MyBeanFactory factory = new MyBeanFactory();
//		UserService userService = factory.createService();
//		userService.service();
//	}
	
	@Test
	public void demo2(){
		String xml="factory/application.xml";
		ApplicationContext a = new ClassPathXmlApplicationContext(xml);
		UserService userService = a.getBean("userService", UserService.class);
		userService.service();
	}
}
