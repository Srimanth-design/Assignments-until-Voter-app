package com.shristi.basic;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row count: ");
		int given_input = input.nextInt();
		
		for (int i = given_input-1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " " + "\t");
			}
			System.out.println();
		}
		input.close();
	}

}
