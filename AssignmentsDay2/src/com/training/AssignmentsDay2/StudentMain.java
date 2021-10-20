package com.training.AssignmentsDay2;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student name:"+" ");
		String student_name = input.nextLine();

		System.out.print("Enter student id :"+" ");
		String studentId = input.next();
		System.out.println("Enter marks :");
		int marks[] = new int[6];

		for (int i = 0; i < marks.length; i++) {
			marks[i] = input.nextInt();
		}
		Student student = new Student(student_name, studentId);
		student.getDetails();
		student.getGrades(marks);

		input.nextLine();

		Scanner input2 = new Scanner(System.in);

		System.out.print("Enter student name:" + "\t");
		String student_name2 = input2.next();
		

		System.out.print("Enter student id :" + "\t");
		String studentId2 = input2.next();
		System.out.println("Enter marks :" + "\t");
		int marks2[] = new int[6];

		for (int i = 0; i < marks2.length; i++) {
			marks2[i] = input.nextInt();
		}

		Student student2 = new Student(student_name2, studentId2);
		student2.getDetails();
		student2.getGrades(marks2);

		input.close();
		input2.close();
	}

}
