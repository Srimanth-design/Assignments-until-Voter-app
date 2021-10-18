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

		Scanner scan = new Scanner(System.in);
		int values[] = new int[3];
		// populating
		System.out.println("Enter input array");// three numbered array
		for (int i = 0; i < values.length; i++) {
			values[i] = scan.nextInt();
		}
		// the work

		for (int i = 0; i < (values.length - 2); i++) {
			if (values[i] > values[i + 1] && values[i] > values[i + 2]) {
				System.out.println(values[i] + " is the greatest of the given array");
			} else if (values[i + 1] > values[i + 2]) {
				System.out.println(values[i + 1] + " is the greatest of the given array");
			} else {
				System.out.println(values[i + 2] + " is the greatest of the given array");
			}
		}
		scan.close();
	}

}
