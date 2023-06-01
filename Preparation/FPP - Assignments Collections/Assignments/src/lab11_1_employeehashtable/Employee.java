package lab11_1_employeehashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord = new HashMap<>();
	
	public void addEntry(String date, double salary) {
		//implement
		salaryRecord.put(date, salary);
		
	}
	public void printPaymentAmount(String date) {
		
		Double salary = (Double)salaryRecord.get(date);
		if(salary != null)
			System.out.println(firstName + " " + lastName + " was paid " + salary + " on " + date);
		else
			System.out.println(firstName + " " + lastName + " did not receive a paycheck on " + date);
	}
	public void printAveragePaycheck() {
		double sum = 0;
		int count = 0;
		for(Double d : salaryRecord.values()) {
			sum += d;
			count++;
		}
//		Set<Map.Entry<String, Double>> s = salaryRecord.entrySet();
//		for(Map.Entry<String, Double> e : s) {
//			sum += (double)e.getValue();
//			count++;
//		}
		
		System.out.println("Average paycheck for " + firstName + " " + lastName + " was " + sum/count);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
