package com.training.Interfaces;

public class Scientific extends Basic implements ScientificCalculator {

	public Scientific() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println("On squaring: "+Math.pow(x, 2));
	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println("On Cubing: "+Math.pow(x, 3));
	}

}
