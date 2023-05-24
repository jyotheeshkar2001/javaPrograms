package com.shristi.quest2;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BasicCalculator basicCalculator=new Basic();
         
         ScientificCalculator  scientificCalculator=new  Scientific();
         scientificCalculator.add(10, 2);
         scientificCalculator.difference(10, 2);
         scientificCalculator.product(10, 2);
         scientificCalculator.divide(10, 2);
         scientificCalculator.cube(3);
         scientificCalculator.square(2);
         
	}

}
