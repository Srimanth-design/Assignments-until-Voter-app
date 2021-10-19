package com.shristi.basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int given_input = input.nextInt();
		int duplicate = given_input;
		int result = 0;
		while (given_input != 0) {
			int remainder = given_input % 10;
			result = (result * 10) + remainder;
			given_input/=10;
		}
		System.out.println("The reverse of " +  duplicate+" is "+result);
		input.close();
	}

}
