package lab4_3.employeeinfo;

public class CheckingAccount extends Account {

	public CheckingAccount(Employee e, double amount) {
		super(e, amount);
	}
	public CheckingAccount(Employee e) {
		super(e);
	}
	
	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}
	
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance - 5;
	}

	@Override
	public String toString() {
		 return "Account type: " + getAcctType() + "\n Current bal: $" + super.getBalance();
	}
	
	
}
