package testingJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class squareTest {
	
	@Test
	void test() {
		SuperCoder test = new SuperCoder();
		int out = test.square(6);
		assertEquals(36, out);
	}

	
}
