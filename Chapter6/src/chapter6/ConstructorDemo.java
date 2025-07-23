package chapter6;

import java.util.ArrayList;

public class ConstructorDemo extends ConstructorDemoParent{
	
	private String schoolStatus;
	private ArrayList<String> hobbies;
	
	public ConstructorDemo() {
		
	}
	
	public ConstructorDemo(String name, int age) {
		super(name, age);
		this.schoolStatus = schoolStatus;
		
	}
	
	public ConstructorDemo(String...hobbies ) {
		this.hobbies = new ArrayList<String>();
		for(String hobby: hobbies) {
			this.hobbies.add(hobby);
		}
	}
	
	
}
