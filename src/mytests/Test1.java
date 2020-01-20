package mytests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class Test1 {
	
	@Test
	void test() {
		Success success = new Success();
		int can = success.countK("daud");
		assertEquals(2, can);
	}
	
}
