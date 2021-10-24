package com.training.Interfaces;

public class Basic implements BasicCalculator {


	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("On Adding: " + (x + y));
	}

	@Override
	public void difference(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("On Subtracting: " + (x - y));
	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("On Multiplying: " + (x * y));
	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("On dividing: " + (x / y));
	}

}
