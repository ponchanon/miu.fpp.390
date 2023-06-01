package lab3_1;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public AccountType getAccountType() {
		return acctType;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Account type = " + acctType + ", balance = " + balance;
	}

	//update the balance field
	public void makeDeposit(double deposit) {
		// implement
		this.balance += deposit;
	}

	//updates the balance field and returns true, unless
	//withdrawal amount is too large; in that case,
	//it does not modify the balance field, and returns false
	public boolean makeWithdrawal(double amount) {
		if(amount < balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
}
