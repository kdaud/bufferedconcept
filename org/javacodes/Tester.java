package javacodes;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Tester {
	
	public static void main(String[] args) {
		System.out.println("Hello Google");
		Map<String, String> student = new HashMap<>(3);
		System.out.println(student.size());
		student.put("Gama", "BSS");
		student.put("Edward", "EDS");
		student.put("Gamas", "BIT");
		student.put("Ruth", "BBC");
		
		String course = student.get("Ruth");
		System.out.println(course);
		int caps = student.size();
		System.out.println(caps);
		System.out.println("_________________");
		Map<String, String > lecturer= new Hashtable<>();
		boolean capacity = lecturer.isEmpty();
		System.out.println(capacity);
		

		//System.out.println(capacitys);
		
		lecturer.put("Kinenephil", "Java");
		
		lecturer.put("Joseph", "Php");
		lecturer.put("Kinene", "C#");
		
		int capacitys = lecturer.size();
		System.out.println(capacitys);
		System.out.println("Oops -----Oops");

		String myteacher = lecturer.getOrDefault("Kinene", "Python");
		System.out.println(myteacher);
	}
	
}
