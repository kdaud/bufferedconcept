package javacodes;

import java.util.HashMap;
import java.util.Map;

public class Tester {
	
	public static void main(String[] args) {
		System.out.println("Hello Google");
		Map<String, String> student = new HashMap<>();
		student.put("Gama", "BSS");
		student.put("Edward", "EDS");
		student.put("Gama", "BIT");
		String course = student.get("Gama");
		System.out.println(course);
		//System.out.println(student.getClass().desiredAssertionStatus());
	}
	
}
