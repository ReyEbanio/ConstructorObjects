package chapter6;

public abstract class AbstractClassDemo {
	private int age; 
	private String information;
	public AbstractClassDemo(int age, String information) {
		this.age = age;
		this.information = information;
	}
	
	protected abstract String printInfo();
	
}
