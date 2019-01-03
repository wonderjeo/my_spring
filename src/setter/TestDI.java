package setter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

	@Test
	public void demo(){
		String xmlPath="setter/application.xml";
		ApplicationContext a = new ClassPathXmlApplicationContext(xmlPath);
		Person person = (Person) a.getBean("person");
		
		System.out.println(person);
	}
}
