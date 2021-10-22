package com.training.AssignmentsDay2;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: "+" ");
		String name = input.nextLine();
		System.out.print("Enter designation: "+" ");
		String designation = input.next();

		Employee employee = new Employee(name, designation);

		if (designation.equalsIgnoreCase("Programmer")) {
			System.out.println("Your bonus amount : "+employee.calcBonus(4000));
		} else if (designation.equalsIgnoreCase("Manager")) {
			System.out.println("Your bonus amount : "+employee.calcBonus(4000, 2000));
		} else if (designation.equalsIgnoreCase("Director")) {
			System.out.println("Your bonus amount : "+employee.calcBonus(4000, 2000, 3000));
		}

		input.close();

	}

}
