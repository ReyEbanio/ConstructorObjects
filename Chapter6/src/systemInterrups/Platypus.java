package systemInterrups;

public class Platypus extends Mammal{
	
	public Platypus() {
		System.out.println("Oh-");
	}
	protected void fly() {
		System.out.println("Pelican");
	}
	
	public static void main(String[] args) {
		var test = new Platypus();
		test.fly();
		System.out.println("Wow-Oh-Pelican");
	}
}
