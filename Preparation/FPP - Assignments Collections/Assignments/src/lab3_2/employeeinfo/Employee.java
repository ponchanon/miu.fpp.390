package lab3_2.employeeinfo;

import java.time.LocalDate;
//import java.util.Date;
//import java.util.GregorianCalendar;

import lab3_1.AccountType;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	
	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVING, startAmount);
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this,  AccountType.RETIREMENT, startAmount);
		
	}

	public String getFormattedAcctInfo() {
		// implement
		String output = "";
		
		if(checkingAcct != null)
			output = String.format("%s%n", checkingAcct.toString());
		if(savingsAcct != null)
			output += String.format("%s%n", savingsAcct.toString());
		if(retirementAcct != null)
			output += String.format("%s%n", retirementAcct.toString());
		
		return  output;
	}
	
	public void deposit(String acctType, double amt){
		// implement
		if(acctType.equals(AccountType.CHECKING))
			checkingAcct.makeDeposit(amt);
		else if(acctType.equals(AccountType.SAVING))
			savingsAcct.makeDeposit(amt);
		else
			retirementAcct.makeDeposit(amt);
	}
	
	public boolean withdraw(String acctType, double amt){
		// implement
		boolean withdrawSuccesssful = false;
		
		if(acctType.equals(AccountType.CHECKING))
			withdrawSuccesssful = checkingAcct.makeWithdrawal(amt);
		else if(acctType.equals(AccountType.SAVING))
			withdrawSuccesssful = savingsAcct.makeWithdrawal(amt);
		else
			withdrawSuccesssful = retirementAcct.makeWithdrawal(amt);
		
		return withdrawSuccesssful;
	}

}
