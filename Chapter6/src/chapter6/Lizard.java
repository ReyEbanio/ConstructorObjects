package chapter6;

public class Lizard extends Reptile{
	static {System.out.println("B");}
	public Lizard(int hatch) {
		super(3);
	}
	public final void layEggs() {
		System.out.println("Lizard");
	}
	
	public static void main(String[] args) {
		var reptile = new Lizard(1);
		reptile.layEggs();
	}
	
}
