package mytests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class CalculatorTest {
	
	@Test
	void testCalculate() {
		Calculator calculator = new Calculator();
		int sum = calculator.calculate(2, 4, 3);
		assertEquals(9, sum);
	}
	
}
