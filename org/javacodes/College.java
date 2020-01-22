package javacodes;


public class College {
	
	public static void main(String[] args) {
		HeadTeacher obj = new HeadTeacher();
		System.out.println(obj.welcome());
		String word = obj.welcome();
		System.out.println("---------------------");
		System.out.println(word.toUpperCase());
		int ff = obj.welcome().length();
		System.out.println(ff);
		System.out.println("Print the length of the string");
		System.out.println(word.toUpperCase().trim().length());
		int ffs = obj.welcome().length();
		System.out.println(ffs);
	}
	
}
