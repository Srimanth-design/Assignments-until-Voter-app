package com.shristi.basic;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Greatest number using the terinery operator

		/*
		 * int first_number = 100, second_number = 145, third_number = 172; String
		 * great_number = (first_number > second_number && first_number > third_number)
		 * ? "First number is the greatest" : (second_number > third_number) ?
		 * "Second number is the greatest" : "Third number is the greatest";
		 * 
		 * System.out.println(great_number);
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("No of elements: ");
		int number = input.nextInt();
		int values[] = new int[number];

		// populating
		System.out.println("Enter input array");// three numbered array
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}
		// the work

		int greater = values[0];
		for (int i = 0; i < values.length; i++) {
			if (greater < values[i]) {
				greater = values[i];
			}
		}
		System.out.println("The greatest of all is " + greater);
		input.close();
	}

}
