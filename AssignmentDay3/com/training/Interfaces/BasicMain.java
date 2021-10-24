package com.training.Interfaces;

import java.util.Scanner;

public class BasicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter first input: "+" ");
		int firstInput = input.nextInt();
		System.out.print("Enter second input: "+" ");
		int secondInput = input.nextInt();

		ScientificCalculator ref = new Scientific();
		System.out.println();
		ref.add(firstInput, secondInput);
		ref.difference(firstInput, secondInput);
		ref.product(firstInput, secondInput);
		ref.divide(firstInput, secondInput);
		ref.square(firstInput);
		ref.cube(firstInput);
		
		
		input.close();
	}

}
