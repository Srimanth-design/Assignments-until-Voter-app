package com.shristi.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int given = input.nextInt();
		int randomvalue = 1;
		if (given == 0) {
			System.out.println("Factorial of 0 is 1");
		} else if (given > 0) {
			for (int i = 1; i <= given; i++) {
				randomvalue *= i;
			}
			System.out.println("The factorial of " + given + " is " + randomvalue);
		}
		input.close();
	}

}
