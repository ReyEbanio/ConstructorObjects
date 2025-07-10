package methodsClass;

public class Main {
	private String name = "BestZoo";
	{System.out.println(name + "-");}
	private static int COUNT = 0;
	static {System.out.println(COUNT+"-");}
	static {COUNT += 10; System.out.println(COUNT + "-");}
	
	public Main() {
		System.out.println("z-");
	}

	public static void main(String[] args) {
		new Main();
	}
}
//0-10-BestZoo-z-