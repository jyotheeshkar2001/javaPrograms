package com.shristi.overloading;

public class Employee {
String name;
String designation;
Employee(String name,String designation)
{
	this.name=name;
	this.designation=designation;
	
}
public double calcBonus(double basicAllowance)
{
	return  basicAllowance;
}
public double calcBonus(double basicAllowance,double CarAllowance)
{
	return  basicAllowance+CarAllowance;
}
public double calcBonus(double basicAllowance,double CarAllowance,double HouseAllowance)
{
	return  basicAllowance+CarAllowance+HouseAllowance;
}
}
