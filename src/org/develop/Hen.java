package org.develop;

public class Hen extends Birds {
	
	public static void myCall(Birds birds) {
		if (birds instanceof Object) {
			System.out.println("Am already coding java programs");
			
		}
	}
	
	public static void main(String[] args) {
		Birds bb = new Hen();
		
		Hen.myCall(bb);
	}
	
	static {
		System.out.println("Am a java lover interested in programming");
	}
	
}
