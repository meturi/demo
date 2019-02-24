package com.manasa;

public class SavingsAc  {
	
	double openingBalance;
	double withdrawlAmount;
	double depositedAmount;
	float annualInterest;
	float monthlyInterest;
	double totalDeposits = 0;
	double totalWithdrawls = 0;
	double totalBalance;

	

	public SavingsAc(double openingBalance, float annualInterest) {
		this.openingBalance = openingBalance;
		this.annualInterest = annualInterest;
	}

	double withdraw(double withdrawlAmount) {
		if (withdrawlAmount > openingBalance) {
			System.out.println("The account has Insufficient Balance");

		} else {
			openingBalance = openingBalance - withdrawlAmount;
			System.out.println("Current balance after withdrawl: " + openingBalance);
			totalWithdrawls = totalWithdrawls + withdrawlAmount;
		}
		return totalWithdrawls;
	}
	
	double deposit(double amountDeposited) {
		openingBalance = openingBalance + amountDeposited;
		totalDeposits = totalDeposits + amountDeposited;
		return totalDeposits;
	}

	double monthlyint(float yearlyInterest) {		
		System.out.println("Annual interest rate " + yearlyInterest);
		monthlyInterest = yearlyInterest / (1200);
		totalBalance = (float) ((monthlyInterest * openingBalance) + openingBalance);
//		setOpeningBalance(totalBalance);
		return totalBalance;
	}

	void display() {
		System.out.println("Initial balance is " + openingBalance);
		System.out.println("Total withdrawl amount is " + totalWithdrawls);
		System.out.println("Total Deposited amount is " + totalDeposits);
		System.out.println("Total current balance in the account is " + totalBalance);
	}

}
