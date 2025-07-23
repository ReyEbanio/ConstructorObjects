package chapter6;

public class OverridingMethodDemoPartTwo extends OverridingMethodDemoPartTwoParent{

	 public static String nameOfClass = "Son";

	public String demoPrivateInSon() {
		return "Parent private";
	}
	
	public static int demoHiding() {
		return 25;
	}
	
}
