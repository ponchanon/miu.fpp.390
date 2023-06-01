package lab6_1;


public class MyTable {
	private Entry[] entries = new Entry[26];
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		Entry result = entries[c % 97];
		return result.str;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		int index = c % 97;
		if(index < 0 || index > 25) {
			System.out.println("Invalid key");
			return;
		}	
		entries[index] = new Entry(s, c);
		
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Entry e : entries) {
			if(e != null)
				sb.append(e + "\n");
		}
		return sb.toString();
	}
	
	
	private class Entry {
		String str;
		char ch;
		Entry(String str, char ch){
			this.str = str;
			this.ch = ch;
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			return ch + "->" + str;
		}
	}

}