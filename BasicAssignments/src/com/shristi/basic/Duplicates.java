package com.shristi.basic;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// finding the duplicates

		Scanner input = new Scanner(System.in);
		System.out.println("No of elements: ");
		int number = input.nextInt();
		int values[] = new int[number];

		// populating
		System.out.println("Enter input array");// three numbered array
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}
		
		for (int i = 0; i < values.length; i++) {
			
			for (int j = i+1; j < values.length; j++) {
				if(values[i]==values[j]) {
					System.out.println("The duplicate value is "+values[j]);
				}
			}
		}
		
		input.close();
	}

}
