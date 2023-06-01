package lab4_3.employeeinfo;

public class SavingsAccount extends Account {
	private static final double INTEREST_RATE = 0.25;
	
	public SavingsAccount(Employee e, double amount) {
		super(e, amount);
	}
	
	public SavingsAccount(Employee e) {
		super(e);
	}
	@Override
	public AccountType getAcctType() {
		return AccountType.SAVING;
	}
	
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (INTEREST_RATE/100) * baseBalance;
		return baseBalance + interest;
	}
	
	@Override
	public String toString() {
		 return "Account type: " + getAcctType() + "\n Current bal: $" + super.getBalance();
	}
	
}
