package com.manasa;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		double startingBalance;

		float annualInterest;
		int months;
		double depositedAmount;
		double withdrawlAmount;

		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Starting balance in account is ");
			startingBalance = s.nextDouble();
			System.out.println("Annual interest rate for the tenure the amount since deposited ");
			annualInterest = s.nextFloat();

			SavingsAc ac = new SavingsAc(startingBalance, annualInterest);

			System.out.println("No. of months passed since the account was opened ");
			months = s.nextInt();

			for (int i = 0; i < months; i++) {
				System.out.println("Amount deposited in current month ");
				depositedAmount = s.nextDouble();

				ac.deposit(depositedAmount);
				System.out.println("Amount withdarwn in current month");
				withdrawlAmount = s.nextDouble();

				ac.withdraw(withdrawlAmount);
				ac.monthlyint(annualInterest);

			}
			ac.display();
		} finally {
			s.close();
		}
	}
}
