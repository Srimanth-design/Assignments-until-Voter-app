package com.shristi.basic;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter required count: ");
		int given_input = input.nextInt();

		int previousNumber = 0;
		int nextNumber = 1;
		for (int i = 1; i <= given_input; i++) {

			System.out.print(previousNumber + " " + "\t");
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
		input.close();
	}

}
