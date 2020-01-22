package coding;


public class Main {
	
	public static void main(String[] args) {
		new Benz();
		Vehicles hg = new Wish();
		Vehicles gh = new Benz();
		Master obj = new Master();
		obj.myCode(hg);
		System.out.println("-----------");
		obj.myCode(gh);
		
	}
	
}
