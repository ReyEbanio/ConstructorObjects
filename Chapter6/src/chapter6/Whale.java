package chapter6;

public abstract class Whale {
	public abstract  void dive();
	public static void main(String[] args) {
		Whale whale = new Orca();
		whale.dive();
	}
}
