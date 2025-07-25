package chapter6;

public class Child extends Parent {
	 String name;
	void setName(String w) {name = w;}
	public static void main(String[] args) {
		final Child m = new Child();
		final Parent t = m;
		m.name = "Elysia";
		t.name = "Sophia";
		
		m.setName("Webby");
		t.setName("Olivia");
		System.out.println(m.name);
		System.out.println(t.name);
	}
}
