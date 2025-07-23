package chapter6;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableObjectDemo {
	
	private String name;
	private int age;
	private ArrayList<String> hobbies = new ArrayList<String>();
	
	private ImmutableObjectDemo() {
		this.name = "Rey";
		this.age = 99;
		hobbies.add("InstruPlay");
		hobbies.add("Riding");
	}
	
	public List<String> getHobbies(){
		//return new ArrayList<String> (this.hobbies);
		return List.copyOf(hobbies);
	}
	
	public static void main(String[] args) {
		ImmutableObjectDemo immuObj = new ImmutableObjectDemo();
	    List<String> hobbiesCopy  =  immuObj.getHobbies();
		System.out.println(hobbiesCopy.toString());
		hobbiesCopy.clear();
		System.out.println(hobbiesCopy.toString());
		
		immuObj.printOriginalHobbies();
		
	}
	private void printOriginalHobbies() {
		System.out.println(hobbies.toString());
	}
}
