package lab2_3;

public class Prog3 {

	public static void main(String[] args) {
		float firstNum = 1.27F;
		float secondNum = 3.881F;
		float thirdNum = 9.6F;
		
		int castSum = (int)(firstNum + secondNum + thirdNum);
		int roundSum = Math.round(firstNum + secondNum + thirdNum);
		
		System.out.println("Sum of floats casted to int: " + castSum);
		System.out.println("Sum of floats rounded to nearest int: " + roundSum);

	}

}
