package com.training.AssignmentsDay2;

public abstract class AbstractBank {
	final int BONUS = 3000;
	double balance;
	
	

	public AbstractBank(double balance) {
		super();
		this.balance = balance;
	}

	abstract void withdraw(double amount);

	abstract void deposit(double amount);

	void getBalance() {
		
		System.out.println("Balance: "+(balance+BONUS));
		
	}
	
	
	
	
}