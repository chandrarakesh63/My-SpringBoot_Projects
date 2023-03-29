package Functionalinterface;

import java.util.function.Predicate;

public class PredictProgram {
	
	
	   public static void main(String[] args)
	   {
		  
	      Predicate<Integer> numberGreaterThan10 = number -> (number > 10);

	      System.out.println(numberGreaterThan10.test(123));

	   }
}
