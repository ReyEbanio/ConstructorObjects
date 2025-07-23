package chapter6;

public class Orca extends Whale {
	static public int Max = 3;
	public void dive() {
		System.out.println("Orca diving.");
	}
	public void dive(int...depth) {
		System.out.println("Orca diving deeper "+Max);
	}
}
