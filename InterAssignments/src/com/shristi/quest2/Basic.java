package com.shristi.quest2;

public class Basic implements BasicCalculator {

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("addition"+(x+y));
	}

	@Override
	public void difference(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("difference"+(x-y));
	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
	System.out.println("multiplication"+(x*y));	
	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
	System.out.println("divide"+(x/y));	
	}

}
