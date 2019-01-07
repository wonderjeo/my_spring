package aop.jdk;

public class MyAspect {

	public void before(){
		System.out.println("Before:\n");
	}
	public void after(){
		System.out.println("After:\n");
	}
}
