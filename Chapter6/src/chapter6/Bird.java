package chapter6;

public class Bird {
	int feathers = 0;
	Bird(int x) {
		this.feathers = x;
	}
	Bird fly() {
		return new Bird(1);
	}
}
