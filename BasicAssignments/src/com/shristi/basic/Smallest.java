package com.shristi.basic;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int values[] = new int[3];
		// populating
		System.out.println("Enter input array");// three numbered array
		for (int i = 0; i < values.length; i++) {
			values[i] = scan.nextInt();
		}
		// the work

		for (int i = 0; i < (values.length - 2); i++) {
			if (values[i] < values[i + 1] && values[i] < values[i + 2]) {
				System.out.println(values[i] + " is the smallest of the given array");
			} else if (values[i + 1] < values[i + 2]) {
				System.out.println(values[i + 1] + " is the smallest of the given array");
			} else {
				System.out.println(values[i + 2] + " is the smallest of the given array");
			}
		}
		scan.close();
	}

}
