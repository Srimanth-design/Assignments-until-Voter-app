package com.shristi.basic;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size");
		int j = input.nextInt();
		System.out.println("Enter the array");
		int given_array[] = new int[j];

		for (int i = 0; i < given_array.length; i++) {
			given_array[i] = input.nextInt();
		}

		// print array starting from last element
		System.out.println("The reverse order is :");
		for (int i = given_array.length - 1; i >= 0; i--)
			System.out.print(given_array[i] + "  ");

		input.close();
	}

}
