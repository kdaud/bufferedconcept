package javacodes;

import java.util.LinkedList;

public class HeadTeacher {
	
	public String welcome() {
		return "Programming is your fun        ";
	}
	
	public LinkedList<String> schools() {
		LinkedList<String> teachers = new LinkedList<>();
		teachers.add("GHS");
		System.out.println(teachers.element());
		teachers.add("OLGC");
		teachers.add("MHS");
		teachers.add("Busesco");
		for (String ss : teachers) {
			System.out.print(ss + " ");
		}
		System.out.println("The current size of the list is: " + teachers.size());
		return teachers;
	}
}
