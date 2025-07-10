package inhiretanceA;

public class GirraffeFamily {
	
	static {System.out.print("A");}
	
	{System.out.print("B");}
	
	public GirraffeFamily(String name) {
		this(1);
		System.out.print("C");
	}
	
	public GirraffeFamily() {
		System.out.print("D");
	}
	
	public GirraffeFamily(int stripes) {
		System.out.print("E");
	}
	
	public static void eatLeaf() {
		System.out.println("Eat leaf.");
	}
}
