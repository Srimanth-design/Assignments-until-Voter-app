package com.training.AssignmentsDay2;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String registered_names[] = new String[] { "Srimanth", "Arun", "Snehangshu", "Ajay" };

		Scanner input = new Scanner(System.in);
		System.out.print("Enter name to register:" + "\t");

		String entry = input.nextLine();
		

		for (String string : registered_names) {
			
			if(entry.equals(string)) {
				System.out.println("Name is not unique");
				System.exit(0);
			}
			
		}
		System.out.println("You are registered");
		

		input.close();

	}

}
