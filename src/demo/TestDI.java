package demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

	@Test
	public void demo(){
		String xmlPath="application.xml";
		ApplicationContext a = new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService = (BookService) a.getBean("bookService");
		
		bookService.addBook();
	}
}
