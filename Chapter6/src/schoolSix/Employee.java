package schoolSix;

import java.awt.List;

public abstract class Employee extends SchoolMember implements Payable{
	List subjectsHandled = new List();
	private double salary;
	
	public Employee(String name, int id, double salary, String... subjects) {
		super(name, id);
		this.setSalary(salary);
		for (String subject : subjects) {
			this.subjectsHandled.add(subject);
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
