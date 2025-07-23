package chapter6;

import java.io.IOException;

public class OverridingMethodDemoParent {
	public String washClothes() {
		return "Parent is washing clothes.";
	}
	
	protected String demoRestrictiveAccess() {
		 return "Parent protected";
	}
	
	public String demoException() throws IOException{
		return "Parent Exception.";
	}
	
	public Number getAge() {
		return 15;
	}
	
}
