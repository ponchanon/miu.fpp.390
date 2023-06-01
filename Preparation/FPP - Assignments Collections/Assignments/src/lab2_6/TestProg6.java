package lab2_6;

import static org.junit.Assert.assertArrayEquals;


import org.junit.Test;

public class TestProg6 {
	
	@Test
	public void testRemoveDups() {
		
		String[] expected = {"horse", "dog", "cat"};
		
		String[] testData = {"horse", "dog", "cat", "horse", "dog"};
		String[] result = Prog6.removeDups(testData);
		
		assertArrayEquals(expected, result);
		
	}

}
