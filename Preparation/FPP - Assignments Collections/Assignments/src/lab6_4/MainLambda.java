package lab6_4;

import java.util.Arrays;

public class MainLambda {

	public static void main(String[] args) {
		String[] names = { "Dawit", "Daniel", "Tarik", "Redae", "Semhar" };

		StringSort ss = new StringSort((s1,s2) -> s1.length() - s2.length());
		ss.stringSort(names);

		System.out.println(Arrays.toString(names));


	}

}
