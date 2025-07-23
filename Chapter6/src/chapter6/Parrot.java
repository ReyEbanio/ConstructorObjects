package chapter6;

public class Parrot extends Bird{
	protected Parrot(int y) {
		super(y);
	}
	protected Parrot fly() {
		return new Parrot(3);
	}
}
