package mytests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class MyTest {
	
	@Test
	void test() {
		Success mytest = new Success();
		int myNum = mytest.computeSquare(8);
		assertEquals(64, myNum);
	}
	
}
