package javacodes;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Tester {
	
	public static void main(String[] args) {
		System.out.println("Hello Google");
		Map<String, String> student = new HashMap<>();
		student.put("Gama", "BSS");
		student.put("Edward", "EDS");
		student.put("Gama", "BIT");
		student.put("Ruth", "BIT");
		String course = student.get("Gama");
		System.out.println(course);
		
		Map<String, String > lecturer= new Hashtable<>();
		boolean capacity = lecturer.isEmpty();
		System.out.println(capacity);
		lecturer.put("Kinene", "Java");
		int capacitys = lecturer.size();
		System.out.println(capacitys);
		lecturer.put("Joseph", "Php");
		lecturer.put("Kinene", "C#");
		
		System.out.println(capacity);
		
		String myteacher = lecturer.getOrDefault("Kinene", "Python");
		System.out.println(myteacher);
	}
	
}
