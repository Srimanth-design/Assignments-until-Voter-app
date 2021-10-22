package com.training.AssignmentsDay2;

public class SavingsOne extends AbstractBank {

	public SavingsOne(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount > balance) {
			System.out.println("Low balance");
		} else {
			balance = balance - amount;
			System.out.println("Withdrawn amount: " + amount);
			System.out.println("Balance : " + balance);

		}
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Savings deposit " + amount);
		System.out.println("Balance: " + (balance + amount));
	}

}
