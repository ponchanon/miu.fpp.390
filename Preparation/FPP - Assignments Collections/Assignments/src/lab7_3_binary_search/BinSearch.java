package lab7_3_binary_search;

public class BinSearch {

	public boolean search(String s, char c) {
		if(s == null || s.isEmpty()) return false;
		if(s.length() == 1) return s.charAt(0) == c;
		int mid = s.length()/2;
		if(c == s.charAt(mid))
			return true;
		if(c < s.charAt(mid))
			return search(s.substring(0, mid), c);
		if(c > s.charAt(mid))
			return search(s.substring(mid + 1), c);
		
		return false;
	}
	public static void main(String[] args) {
		BinSearch bs = new BinSearch();
		System.out.println(bs.search("abcde", 'f'));
		System.out.println(bs.search("abcdefghijklm", 'a'));
	}
}
