package Functionalinterface;
import java.util.function.*;
public class Function {
	
	   public static void main(String[] args)
	   {
	      fun obj = (n1, n2) -> n1+n2;
	      
	      System.out.println(obj.sum(12, 56));  
	   }
}
interface fun {
	
	int sum(int n1, int n2);
	
}
