package lab2_6;

import java.util.Arrays;

public class Prog6 {
	
	public static void main(String[] args) {
		String[] animals = {"horse", "dog", "cat", "horse", "dog"};
		System.out.println(Arrays.toString(removeDups(animals)));
	}

	public static String[] removeDups(String[] arr) {
		
		String[] newArray = new String[arr.length];
		int index = 0;
		
		for(String s : arr) {
			boolean exist = false;
			
			for(int i = 0; i <= index; i++) {
				if(s.equals(newArray[i]))
					exist = true;	
			}
			
			if(!exist) {
				newArray[index++] = s;
			}
			
		}
		
		String[] result = new String[index];
		System.arraycopy(newArray, 0, result, 0, index);
		
		return result;
	}
}
