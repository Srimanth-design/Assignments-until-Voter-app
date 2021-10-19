package com.shristi.basic;

import java.util.Scanner;

public class SumAverage {

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

		System.out.println("Calculating sum and average");
		int sum = 0;
		for (int each : demo_values) {
			sum += each;

		}

		System.out.println("The sum : " + sum);

		float average = ((float) sum / demo_values.length);

		System.out.println("The average : " + average);

		input.close();
	}

}
