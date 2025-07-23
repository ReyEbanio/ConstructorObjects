package chapter6;

public class Macaw extends Parrot{
	public Macaw(int z) {
		super(z);
	}
	public Macaw fly() {
		return new Macaw(3);
	}
	public static void main(String[] args) {
		Bird p = new Macaw(4);
		System.out.println(((Parrot)p.fly()).feathers);
	}
}

