package systemInterrups;



public class BirdSeed {
	private int numberBags;
	boolean call;
	
	public BirdSeed() {
		this(2);
		call = false;
	}
	
	public BirdSeed(int numberBags) {
		this.numberBags = numberBags;
	}
	
	public int testOverload() {
		return 1;
	}
	
	protected void testOverride() {
		
	}
	
	static final void getAge() {
		
	}
	
	private static void getPhoneNumber() {
		
	}
	
	private final int numberOfBooks() {
		return 1;
	}
	
	public  static void main(String[] args) {
		var seed = new BirdSeed();
		System.out.println(seed.numberBags);
	}
	
}
