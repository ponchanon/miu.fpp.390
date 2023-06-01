package lab4_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Professor p1 = new Professor("John Doe", 5000, 2015, 10, 15, 10);
		Professor p2 = new Professor("Eric Dyer", 10000, 2016, 03, 23, 10);
		Professor p3 = new Professor("Wayne Rooney", 7000, 2014, 9, 8, 10);
		
		Secretary s1 = new Secretary("Sara Luke", 3000, 2017, 07, 07, 200);
		Secretary s2 = new Secretary("Savanah Peter", 4500, 2015, 11, 9, 200);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s1;
		department[4] = s2;
		
		System.out.println("Do you wish to see the sum of all salaries (Y/N):");
		String reply = input.nextLine();
		
		double salarySum = 0;
		if(reply.equalsIgnoreCase("Y")) {
			for(DeptEmployee de : department) {
				salarySum += de.computeSalary();
			}
		}
		else {
			System.out.println("Goodbye!");
			System.exit(0);
		}
		System.out.println("Sum of all salaries is: " + salarySum);
		input.close();
	}

}
