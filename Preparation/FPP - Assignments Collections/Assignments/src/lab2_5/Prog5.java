package lab2_5;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a any string: ");
		String inputString = input.nextLine();
		
		for(int i = inputString.length() - 1; i >= 0; i--) {
			System.out.print(inputString.charAt(i));
		}
		
		input.close();
	}

}
