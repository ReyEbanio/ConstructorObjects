package chapter6;

import java.io.FileNotFoundException;

public class OverridingMethodDemo  extends OverridingMethodDemoParent{
	@Override
	public String washClothes() {
		return "Son is washing Clothes";
	}
	
	@Override
	public String demoRestrictiveAccess() {
		return "Son public";
	}
	
	@Override
	public String demoException() throws FileNotFoundException{
		return "Exception son";
	}
	
	@Override
	public Integer getAge() {
		return 15;
	}
}
