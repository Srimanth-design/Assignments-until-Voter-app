package com.shristi.basic;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row count: ");
		int given_input = input.nextInt();
		int increment = 1;
		for (int i = 0; i <= given_input; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(increment++ + " " + "\t");
			}
			System.out.println();
		}
		input.close();
	}

}
