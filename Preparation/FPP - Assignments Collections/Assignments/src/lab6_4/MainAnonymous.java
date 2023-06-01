package lab6_4;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {

	public static void main(String[] args) {
		String[] names = {"dawit", "elsa", "henoka", "ash"};
		
		StringSort ss = new StringSort(new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		ss.stringSort(names);
		System.out.println(Arrays.toString(names));
	}
}
