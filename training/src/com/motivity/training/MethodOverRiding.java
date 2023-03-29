package com.motivity.training;


 class Child1 {

	 
	public void method1(int studentAge)
	{
		 System.out.println("Student age is OverRided");
	}
		 
}
 public class MethodOverRiding extends Child1{
	@Override	
	 public void method1(int studentAge)
		{
			System.out.println("Student age is "+studentAge);
		}
		public static void main(String []agrs) {
			
			MethodOverRiding m1=new MethodOverRiding();
			m1.method1(23);
			 }
	}

