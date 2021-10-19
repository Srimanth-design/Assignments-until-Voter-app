package com.shristi.basic;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

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

		int size = array.length;
		Arrays.sort(array);
		int second_largest = array[size - 2];

		System.out.println("Second largest of the given array is " + second_largest);
		input.close();
	}

}
