package com.training.AssignmentsDay2;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(double withdraw_amount) {
		if(withdraw_amount>balance) {
			System.out.println("Low balance");
		}
		else {
		System.out.println("Withdraw_amount : "+withdraw_amount);
		}
	}

	public void deposit(double deposit_amount) {
		System.out.println("deposit_amount : "+deposit_amount);

	}
	public double getBalance(double balance,double withdraw_amount) {
		return balance-withdraw_amount;
	}

}
