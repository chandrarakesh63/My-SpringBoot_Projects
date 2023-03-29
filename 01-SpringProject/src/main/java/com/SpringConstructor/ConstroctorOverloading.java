package com.SpringConstructor;

public class ConstroctorOverloading {

	private int num;
	private int num1;
	
	public ConstroctorOverloading(double num,double num1)
	{
	  this.num=(int)num;
	  this.num1=(int)num1;
	  System.out.println("This is the int , int constructor");
	}
	
	public ConstroctorOverloading(int num,int num1)
	{
		this.num=num;
		this.num1=num1;
		System.out.println("This is the double , double constructor");
	}
	public void doSum()
	{
		System.out.println("Sum is " +(this.num+ this.num1));
	}

	@Override
	public String toString() {
		return "ConstroctorOverloading [num=" + num + ", num1=" + num1 + "]";
	}
	
	
}
