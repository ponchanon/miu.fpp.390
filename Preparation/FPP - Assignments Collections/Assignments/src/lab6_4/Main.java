package lab6_4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] names = {"Dawit", "Daniel","Tarik","Redae","Semhar"};
		
		StringSort ss = new StringSort(new StringLengthComparator());
		ss.stringSort(names);
		
		System.out.println(Arrays.toString(names));

	}

}
