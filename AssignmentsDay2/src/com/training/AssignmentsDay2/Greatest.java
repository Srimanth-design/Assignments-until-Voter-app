package com.training.AssignmentsDay2;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Greatest number using the terinery operator

		int first_number = 100, second_number = 145, third_number = 172;
		String great_number = (first_number > second_number && first_number > third_number)
				? "First number is the greatest"
				: (second_number > third_number) ? "Second number is the greatest" : "Third number is the greatest";

		System.out.println(great_number);

	}

}
