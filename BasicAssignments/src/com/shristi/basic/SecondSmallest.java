package com.shristi.basic;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("No of elements: ");
		int number = input.nextInt();
		int array[] = new int[number];
		System.out.println("Enter the values of array");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		Arrays.sort(array);
		int second_smallest = array[1];

		System.out.println("Second smallest of the given array is " + second_smallest);
		input.close();

	}

}
