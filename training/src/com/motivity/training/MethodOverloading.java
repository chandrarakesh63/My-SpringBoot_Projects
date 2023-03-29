package com.motivity.training;

public class MethodOverloading {
	public static void method1(int stAge)
	{
		
		System.out.println("Student age is "+stAge);
	}
	public static void method1(String stName)
	{
		
		System.out.println("Student name is "+stName);
	}
	public static void main(String[] args) {
		method1(22);
		method1("Rakesh Chandra Mohanty");
	}

}

