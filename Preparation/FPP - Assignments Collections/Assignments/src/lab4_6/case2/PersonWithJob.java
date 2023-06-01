package lab4_6.case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		PersonWithJob pwj = (PersonWithJob)obj;
		boolean isEqual = this.getName().equals(pwj.getName()) && this.getDateOfBirth().equals(pwj.getDateOfBirth()) && this.salary == pwj.salary;
				
		return isEqual;
	}
	
	
	

}
