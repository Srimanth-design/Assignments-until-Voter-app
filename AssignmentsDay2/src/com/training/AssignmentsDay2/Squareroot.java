package com.training.AssignmentsDay2;

import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("No of elements: ");
		int number = input.nextInt();
		int demo_values[] = new int[number];
		

		System.out.println("Enter the array values");
		for (int i = 0; i < demo_values.length; i++) {
			demo_values[i] = input.nextInt();
		}
		// iterating

		System.out.println("Calculating squareroot");

		for (int each : demo_values) {

			float k = (float) Math.sqrt(each);
			System.out.print(k + " \t");

		}

		input.close();
	}

}
