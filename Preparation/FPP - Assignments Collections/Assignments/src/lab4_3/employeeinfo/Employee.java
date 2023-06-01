package lab4_3.employeeinfo;

import java.time.LocalDate;
import lab4_3.MyStringList;

public class Employee {

	private AccountList accounts;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList();
	}
	
	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	public void createNewChecking(double startAmount) {
		// implement
		Account acct = new CheckingAccount(this, startAmount);
		accounts.add(acct);
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		Account acct = new SavingsAccount(this, startAmount);
		accounts.add(acct);
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		Account acct = new RetirementAccount(this, startAmount);
		accounts.add(acct);
	}

	public String getFormattedAcctInfo() {
		String output = "";
		
		for(int i = 0; i < accounts.size(); ++i) {
			if(accounts.get(i) != null)
				output += String.format("%s%n", accounts.get(i).toString());
		}
		
		return  output;
	}
	
	public void deposit(int accountIndex, double amt){
		// implement
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);
	}
	
	public boolean withdraw(int accountIndex, double amt){
		// implement
		boolean withdrawSuccesssful = false;
		Account selected = accounts.get(accountIndex);
		withdrawSuccesssful = selected.makeWithdrawal(amt);
		
		if(withdrawSuccesssful)
			System.out.println("Withdrawal successful");
		else
			System.out.println("Sorry. No enough funds available.");
		
		return withdrawSuccesssful;
	}
	
	// complete the implementaion
	public MyStringList getNamesOfAccounts() {
		MyStringList acctNameList = new MyStringList();
		for(int i = 0; i < accounts.size(); ++i) {
			acctNameList.add(accounts.get(i).getAcctType().toString());
		}
		return acctNameList;
	}
}
