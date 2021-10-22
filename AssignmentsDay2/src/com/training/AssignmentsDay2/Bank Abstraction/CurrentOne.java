package com.training.AssignmentsDay2;

public class CurrentOne extends AbstractBank {

	public CurrentOne(double balance) {
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
			System.out.println("Amount withdrawn: " + amount);
			System.out.println("The balance amount: " + balance);
		}
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount deposited: " + amount);
		System.out.println("Updated balance: " + (amount + balance));

	}

}
