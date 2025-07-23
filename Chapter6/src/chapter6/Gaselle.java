package chapter6;

public class Gaselle extends Antelope{
	public Gaselle(int p) {
		super(6);
		System.out.println("3");
	}
	public static void main(String[] args) {
		new Gaselle(0);
	}
	static {System.out.println("8");}
	{System.out.println("9");}
}
