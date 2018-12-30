package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		//
		
		ApplicationContext a = new ClassPathXmlApplicationContext("classpath:/application.xml");
		HelloWorld helloWorld = (HelloWorld)a.getBean("helloWorld");
		helloWorld.say();
	}
}
