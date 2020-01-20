package test;

public class Mentor {

	boolean status = true;
	
	private String name;
	
	public Mentor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isHapy() {
		
		return status;
	}
	
}
