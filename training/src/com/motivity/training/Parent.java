package com.motivity.training;

public class Parent {
		
		public static void method1()
		{
			int MyAge=22;
			System.out.println(MyAge);
		}
}
class Child extends Parent{
	public static void method2()
	{
		int mySonAge=10;
		System.out.println(mySonAge);
		Child chintu=new Child();
		chintu.method2();
		Parent papa=new Parent();
		papa.method1();
		Parent maa=new Child();
		maa.method1();
	}
}
