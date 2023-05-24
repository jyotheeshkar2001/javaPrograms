package com.shristi.quest2;

public class Scientific extends Basic implements ScientificCalculator {

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println("square"+(x*x));
	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println("cube"+(x*x*x));
	}

}
