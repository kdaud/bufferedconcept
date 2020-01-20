package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class Tester {
	
	private Mentor mentor = new Mentor("Daud");
	
		@Test
		public void testName() throws Exception {
			
			String name = mentor.getName();
			assertEquals("Daud", name);
			
		}
	
	@Test
	public void testIsHapy() throws Exception {
		
		boolean level = mentor.isHapy();
		assertTrue(level);
	}
	
}
