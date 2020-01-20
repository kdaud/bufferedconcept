package mytests;


public class Success {
	
	public int computeSquare(int h) {
		return h * h;
	}
	
	public int countK(String myName) {
		int count = 0;
		for (int i = 0; i < myName.length(); i++) {
			if (myName.charAt(i) == 'k' || myName.charAt(i) == 'K') {
				count++;
			}
		}
		return count;
	}
	
	public String myCollege(String college) {
		
		return college;
	}
}
