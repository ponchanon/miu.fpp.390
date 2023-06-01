package lab7_2;

public class MinSort2 {
	
	String sort(String input) {
		if(input == null || input.length() == 0)
			return "";
		
		char ch = min(input);
		int minPos = input.indexOf(ch);
		char[] chArray = input.toCharArray();
		chArray[minPos] = chArray[0];
		input = new String(chArray);
		
		return ch + sort(input.substring(1));
	}
	
	public Character min(String str) {
		if(str == null || str.length() == 0)
			return null;
		char ch = str.charAt(0);
		if(str.length() == 1)
			return ch;
		char c = min(str.substring(1));
		
		return (ch < c ? ch : c);
	}
	public static void main(String[] args) {
		MinSort2 ms = new MinSort2();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);

	}

}
