package com.training.AssignmentsDay2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank(20000);
		System.out.println("Balance :" + bank.balance);
		System.out.print("Enter the money to be deposited:"+" ");
		Scanner input = new Scanner(System.in);
		double toDeposit = input.nextInt();
		System.out.println("Enter the money to withdraw");
		double toWithdraw = input.nextInt();
		bank.deposit(toDeposit);
		bank.withdraw(toWithdraw);
		if((bank.balance+toDeposit)>toWithdraw ) {
			System.out.println("Balance will be " + bank.getBalance((bank.balance + toDeposit), toWithdraw));
		}
		
		input.close();
	}

}