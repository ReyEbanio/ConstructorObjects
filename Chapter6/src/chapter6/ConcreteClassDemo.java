package chapter6;

public class ConcreteClassDemo extends AbstractClassDemo{
	private int age;
	private String information;
	private String concreteID; 
	
	public ConcreteClassDemo(int age, String information, String concreteID) {
		super(age, information);
		this.concreteID = concreteID;
	}
	
	public String printInfo() {
		return "Your age is "+age;
	}
	
}
