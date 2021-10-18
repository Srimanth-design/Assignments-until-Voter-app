package com.shristi.basic;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int demo_values[] = new int[4];
		System.out.println("Enter the array values");
		for (int i = 0; i < demo_values.length; i++) {
			demo_values[i] = scan.nextInt();
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

		scan.close();
	}

}
