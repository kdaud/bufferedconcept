package testingJunit;

public class SuperCoder {
	
	public int square(int n) {
		return n * n;
	}
	
	public int myCount(String word) {
		int count = 0;
		for (int i = 0; i <= word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
				count ++;
		}
	}
		return count;
		
	}
	
}
