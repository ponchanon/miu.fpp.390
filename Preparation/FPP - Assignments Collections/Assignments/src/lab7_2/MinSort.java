package lab7_2;

public class MinSort {
	
	String sort(String input) {
		if(input == null || input.length() ==0)
			return "";
		
		char[] charArr = input.toCharArray();
		int minPos=0;
		char ch = charArr[0];
		
		for(int i=1; i< charArr.length; ++i) {
			if(charArr[i] < ch){
				minPos = i;
				ch = charArr[i];
			}
		}
		charArr[minPos] = charArr[0];
		charArr[0] = ch;
		input = new String(charArr);
		
		return ch + sort(input.substring(1));
	
	}
	public static void main(String[] args) {
		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);
	}

}
