package chapter6;

public class ClassInitializationDemo extends ClassInitialDemoParent{
	protected static String race;
	protected static String planet;
	
	static {
		race = "human";
		planet = "earth";
	}

	public static String getRace() {
		return race;
	}

	public static String getPlanet() {
		return planet;
	}
}
