package com.SingleToneProgram;

public class SingleTone {
	private static SingleTone number=null;
	private SingleTone()
	{
		System.out.println("jdjdj");
	}
	public static SingleTone getSingleTone()
	{
	if (number==null)
	{
		number=new SingleTone();
		System.out.println("first object is created   ");
	}
	else {
	}
	return number;

	}
	
	public static void main(String[] args) {
		SingleTone s=SingleTone.getSingleTone();
		SingleTone s2=SingleTone.getSingleTone();
		SingleTone s3=SingleTone.getSingleTone();
		
	}
}
