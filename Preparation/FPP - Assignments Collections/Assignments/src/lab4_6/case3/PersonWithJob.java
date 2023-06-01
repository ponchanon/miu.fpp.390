package lab4_6.case3;

import java.util.GregorianCalendar;
import java.util.Objects;

public class PersonWithJob {
	private double salary;
	private Person person;
	
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		this.person = new Person(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
		
		//Java 8 way - simple and short
		//Objects.hash(salary, person);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonWithJob other = (PersonWithJob) obj;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
	
	
}
