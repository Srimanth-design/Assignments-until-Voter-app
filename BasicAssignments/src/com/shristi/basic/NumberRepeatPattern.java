package com.shristi.basic;

import java.util.Scanner;

public class NumberRepeatPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row count: ");
		int given_input = input.nextInt();

		for (int i = 1; i <= given_input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " " + "\t");
			}
			System.out.println();
		}
		input.close();
	}

}
