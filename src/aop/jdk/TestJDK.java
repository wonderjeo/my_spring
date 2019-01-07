package aop.jdk;

import org.junit.Test;

public class TestJDK {

	@Test
	public void demo1(){
		UserService userService = MyFactory.createUserService();
		userService.addUserService();
		userService.updateUserService();
		userService.deleteUserService();
	}
}
