package chapter6;

public class OverridingMethodDemoPartTwoParent {
	
	 public static String nameOfClass = "Parent";
	
	private String demoPrivateInSon() {
		return "Parent private";
	}
	
	public static int demoHiding() {
		return 15;
	}
	
	public final int demoInstance() {
		return 25;
	}
	
}
