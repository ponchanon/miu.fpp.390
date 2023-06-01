package lab2_7;

import lab2_2.RandomNumbers;

public class Prog7 {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 2; i++) {
			
			String output = "";
			output = String.format("%16d %12d %12d %12d %n %n", rand(), rand(), rand(), rand());
			output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", rand(), "+", rand(), "+", rand(), "+", rand());
			output += String.format("%16s %12s %12s %12s %n%n%n%n","____", "____", "____", "____");
			System.out.println(output);
		}
	}

	static int rand() {
		return RandomNumbers.getRandomInt(1, 99);
	}
	

}
