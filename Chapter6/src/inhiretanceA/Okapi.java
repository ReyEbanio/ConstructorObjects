package inhiretanceA;

public class Okapi extends GirraffeFamily{
	
	static {System.out.print("F");}
	
	public Okapi(int stripes) {
		super("sugar");
		System.out.print("G");
	}
	
	{System.out.print("H");}
//	public static void eatLeaf() {
//		System.out.println("I don't eat leaf.");
//	}
	public static void main(String[] args) {
		eatLeaf();
	}
	
}

//AFBECHG
//BECHG