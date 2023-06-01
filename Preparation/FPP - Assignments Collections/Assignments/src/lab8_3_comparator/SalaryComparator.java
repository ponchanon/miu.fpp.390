package lab8_3_comparator;

import java.util.Comparator;
import java.util.Date;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();
		Date hireDate1 = e1.getHireDate();
		Date hireDate2 = e2.getHireDate();
		int salary1 = e1.getSalary();
		int salary2 = e2.getSalary();
		
		if(salary1 != salary2) {
			if(salary1 < salary2)
				return -1;
			else
				return 1;
		}
		//now salary1 equals salary2
		if(name1.compareTo(name2) != 0) {
			return name1.compareTo(name2);
		}
		
		//now salary1 equals salary2 and name1 equals name2
		return hireDate1.compareTo(hireDate2);
	}

}
