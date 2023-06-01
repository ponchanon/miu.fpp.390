package lab6_4;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	Comparator<String> sc;
	
	StringSort(Comparator<String> myComparator){
		sc = myComparator;
	}
	
	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, sc);
		return arr;
	}
}
