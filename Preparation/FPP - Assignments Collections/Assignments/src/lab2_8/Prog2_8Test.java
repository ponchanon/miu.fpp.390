package lab2_8;

import junit.framework.TestCase;

public class Prog2_8Test extends TestCase {
	
	public void testMin() {
		int[] testData = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int result = Prog2_8.min(testData);
		
		assertEquals(-22, result);
		
		//you can also use assertTrue
		assertTrue(-22 == result);
	}

}
