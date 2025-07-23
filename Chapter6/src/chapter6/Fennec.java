package chapter6;

public class Fennec extends Fox{
	public Fennec(int e) {
		super("tails");
		print("j");
	}
	
	public Fennec(short f) {
		super("eevee");
		print("m");
	}
	
	public static void main(String[] args) {
		System.out.println(new Fennec(1).view());
	}
	
}
