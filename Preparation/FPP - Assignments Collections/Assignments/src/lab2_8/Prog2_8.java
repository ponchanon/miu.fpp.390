package lab2_8;

public class Prog2_8 {

	static int min(int[] arrayOfInts) {
		int min = arrayOfInts[0];
		
		for(int nextNum : arrayOfInts) {
			if(min > nextNum) {
				min = nextNum;
			}
		}
		return min;
	}

}
