package com.training.AssignmentsDay2;

public class Student {

	String name, studentId;

	public Student(String name, String studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}

	void getDetails() {
		System.out.println("Details are of "+name+" : "+studentId);

	}

	int sum = 0;
	float average;

	void getGrades(int[] marks) {

		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		average = sum / marks.length;

		if (average > 85) {

			System.out.println(name + " passed out with grade A");
		} else if (average >= 70 && average <= 85) {
			System.out.println(name + " passed out with grade B");
		} else {
			System.out.println(name + " passed out with grade C");
		}

	}
}
