package com.shristi.basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter value");
		String input = scan.next();

		int input_to_int = Integer.parseInt(input);
		int duplicate = input_to_int;
		int result = 0;
		while (duplicate != 0) {

			int remainder = duplicate % 10;
			result = (int) (result + Math.pow(remainder, input.length()));
			duplicate /= 10;
		}

		if (result == input_to_int) {
			System.out.println(input + " is an armstrong number");
		} else {
			System.out.println(input + " not an armstrong number");
		}

		scan.close();
	}

}
