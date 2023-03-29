package CalculatorProgram;
    // Question Number 3...
public class Calculator {
	public static void powerInt(int num1,int num2)
	{
		System.out.println(Math.pow(num1,num2));
		
	}
	public static void powerDouble(double num1,int num2)
	{
		System.out.println(Math.pow(num1, num2));
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("Square of two intiger type data");
		c.powerInt(10,4);
		System.out.println("Square of one double type and one integer type data");
		c.powerDouble(12.2,3);
	}

}
