package lab4_3.employeeinfo;

public class RetirementAccount extends Account {

	public RetirementAccount(Employee e, double amount) {
		super(e, amount);
	}
	
	public RetirementAccount(Employee e) {
		super(e);
	}
	
	@Override
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}
	
	@Override
	public boolean makeWithdrawal(double amount) {
		// implement
		double baseBalance = super.getBalance();
		double penalty = amount * 0.02;
		double deductable = amount + penalty;
		
		if(deductable < baseBalance) {
			baseBalance -= deductable;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		 return "Account type: " + getAcctType() + "\n Current bal: $" + super.getBalance();
	}
	
}
