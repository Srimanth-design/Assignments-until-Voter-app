package com.training.AssignmentsDay2;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userNames[] = new String[] { "Srimanth", "Arun", "Snehangshu", "Ajay" };

		Scanner input = new Scanner(System.in);
		System.out.print("Enter username to login:" + " ");

		String entry = input.nextLine();

		for (String string : userNames) {

			if (entry.equals(string)) {
				System.out.println("You are logged in succesfully");
				System.exit(0);
			}
			

		}
		System.out.println("Invalid username");
		input.close();
	}

}
