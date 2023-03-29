package com.motivity.training;

public class Sample {
	 int x;
	 static String studentName="lipa";
	public static void main(String[] args) {
		System.out.println("This is the string type value    "+studentName);                 // String is Printing now.. 
		int studentAge=10;                                  // This is initialization of a variable .
		studentAge++;                                      // This is the increment by one .
		System.out.println(studentAge+10);                 // This is addition of two number..
		System.out.println(studentAge);
		char stFirstName='l';                            // This is the initialization for character.
		System.out.println(stFirstName);                 
		Sample sm=new Sample();                         // This is the Object creation of Sample class.
		System.out.println(sm.x);                      // This is the not initialize variable...
		}
	}