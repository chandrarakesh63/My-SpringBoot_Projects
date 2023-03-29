package Functionalinterface;

import java.util.function.BiConsumer;

public class BiConsumer1 {

	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> b1 = (value,value1) -> System.out.println(value + value1);
		b1.accept(43,32);
		
		BiConsumer<String,Character> b2 = (name,firstLetter) -> System.out.println(name+ " , " +firstLetter);
		b2.accept("Rakesh chandra mohanty",'R');
		
		BiConsumer<Character,Character> c= (last,first) -> System.out.println(last + first);
		c.accept('R','L');
		
		BiConsumer<Integer,Character> ic= (num , letter) -> System.out.println(num + letter);
		ic.accept(23,'r');
	}
}
