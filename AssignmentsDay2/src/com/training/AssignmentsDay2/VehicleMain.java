package com.training.AssignmentsDay2;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle car = new Vehicle("Ford", "Mustang", 5600000);
		Vehicle bike = new Vehicle("Yamaha", "Fz", 45000);

		car.getDetails();
		bike.getDetails();

	}

}
