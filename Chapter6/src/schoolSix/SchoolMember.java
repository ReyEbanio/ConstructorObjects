package schoolSix;

public abstract class SchoolMember {
	private String name;
	private int id;
	
	public SchoolMember(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public abstract void timeIn();
	public abstract void timeOut();
}
