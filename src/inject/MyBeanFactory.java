package inject;

public class MyBeanFactory {

	public static UserService createService(){
		return new UserServiceImpl();
	}
}
