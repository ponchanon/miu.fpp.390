package lab3_1;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("John", "Doe", 50000, 2017, 07, 13);
		
		Account act = new Account(employee, AccountType.CHECKING, 1300);
		Account act1 = new Account(employee, AccountType.SAVING, 4500);
		Account act2 = new Account(employee, AccountType.RETIREMENT, 10000);
		
		System.out.println(act.toString());
		System.out.println(act1.toString());
		System.out.println(act2.toString());
	}

}
