package chapter6;

public class InstanceInitializationDemoParent {
	private String name;
	private int age;
	
	{
		name = "Bri";
		age = 16;
	}
	
	public InstanceInitializationDemoParent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
