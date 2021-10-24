package com.voterapp.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.voterapp.exception.NotEligibleException;

import com.voterapp.service.ElectionBooth;

public class Voter {

	public static void main(String[] args) throws NotEligibleException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		ElectionBooth voting = new ElectionBooth();
		int age = 0;
		String location = null;
		int voterId = 0;
		try {
			System.out.print("Enter age: " + " ");
			age = input.nextInt();
			System.out.print("Enter locality: " + " ");
			location = input.next();
			System.out.print("Enter voter ID: " + " ");
			voterId = input.nextInt();
		} catch (InputMismatchException e1) {
			// TODO Auto-generated catch block
			System.out.println("Input error -- Check again");
		}

		try {
			voting.CheckEligibility(age, location, voterId);
		} catch (NotEligibleException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		input.close();
	}

}
