package chapter6;

public class ClassInitialDemoParent {
	protected static int countSon;
	protected static int goodSon;
	
	static {
		countSon = 5;
		goodSon = 2;
	}
	 
	public int getCountOfSon() {
		return countSon;
	}
	
	public int getGoodSon() {
		return goodSon;
	}
	
}
