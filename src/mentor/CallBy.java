package mentor;

public class CallBy implements Inherit2 {
	
	static final int grade = 85;
	public static void main(String[] args) {
		
		System.out.println(grade);
		
	}
	@Override
	public void myCall() {
		System.out.println(MYCOUNTRY + " is my mother land");
		
	}


	
}
