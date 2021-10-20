package com.training.AssignmentsDay2;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();
		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();
		System.out.println("Enter third number: ");
		int thirdNumber = input.nextInt();
		
		// the work
		
		if(firstNumber<secondNumber && secondNumber<thirdNumber) {
			System.out.println(firstNumber +" is the smallest number");
		}
		else if(secondNumber<thirdNumber) {
			System.out.println(secondNumber +" is the smallest number");
		}
		else {
			System.out.println(thirdNumber + " is the smallest number");
		}
		input.close();
	}

}
