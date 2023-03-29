package com.motivity.training;

public class InstanceMethods{
	public void method1()
	{   
		System.out.println("This is the instance method called");
	}
	public static void method2()
	{
		System.out.println("This is the static method called");
	}
	public static void main(String[] args) {
		InstanceMethods i=new InstanceMethods();
		i.method1();                                 // Here i called the nonstatic method.
		method2();                                   // Here i called the static method.
	}

}
