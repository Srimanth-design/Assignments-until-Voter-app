package com.training.AssignmentsDay2;

public class Vehicle {

	String name, model;
	double price;

	public Vehicle(String name, String model, double price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}

	void getDetails() {
		System.out.println(model + " from " + name + " is of " + price + " only");
	}
}
