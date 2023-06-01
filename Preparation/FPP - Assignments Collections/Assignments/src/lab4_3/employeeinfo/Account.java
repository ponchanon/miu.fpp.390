package lab4_3.employeeinfo;

abstract class Account{
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	//private AccountType acctType;
	private Employee employee;

	Account(Employee emp, double balance) {
		employee = emp;
		//this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	abstract AccountType getAcctType();
	/*
	public AccountType getAccountType() {
		return acctType;
	}
	*/
	
	public double getBalance() {
		return balance;
	}
	
//	public String toString() {
//		//return "type = " + acctType + ", balance = " + balance;
//		return "Account type: " + acctType + "\n Current bal: $" + balance;
//	}

	//update the balance field
	public void makeDeposit(double deposit) {
		// implement
		this.balance += deposit;
	}

	//updates the balance field and returns true, unless
	//withdrawal amount is too large; in that case,
	//it does not modify the balance field, and returns false
	public boolean makeWithdrawal(double amount) {
		// implement
		if(amount < balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Account type: " + getAcctType().toString() + "\n Current bal: $" + balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	
	

	

}
