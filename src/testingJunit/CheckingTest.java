package testingJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class CheckingTest {
	
	@Test
	void test() {
		SuperCoder myA = new SuperCoder();
		int myvalue = myA.myCount("java");
		assertEquals(2, myvalue);
	}
	
}
