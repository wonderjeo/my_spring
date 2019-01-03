package factory;

public class MyBeanFactory {

	public UserService createService(){
		return new UserServiceImpl();
	}
}
