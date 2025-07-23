package chapter6;

import java.util.Date;

public class InstanceInitializationDemo extends InstanceInitializationDemoParent{
	
	private Date dateOfConstruction;
	
	public InstanceInitializationDemo(String name, int age, Date dateOfConstruction) {
		super(name, age);
		this.dateOfConstruction = dateOfConstruction;
	}
	
	public Date getDateOfConstruction() {
		return dateOfConstruction;
	}
	
}
