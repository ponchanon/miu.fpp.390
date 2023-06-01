package lab7_3_binary_search;

import junit.framework.TestCase;

public class TestBinSearch extends TestCase {

	public void testSearch() {
		String input = "abcdefghijklmn";
		BinSearch bs = new BinSearch();
		
		assertTrue(bs.search(input, 'd'));
		assertTrue(bs.search(input, 'x'));
		
	}
}
