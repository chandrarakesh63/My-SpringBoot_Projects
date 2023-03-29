package Functionalinterface;

import java.util.function.Consumer;

public class Consumer1 {
	public static void main(String[] args) {
		Consumer<String> c1= (name) -> System.out.println(name);
		c1.accept("rakesh is a good boy");
		
		Consumer<Boolean>b= flag -> System.out.println(flag);
		b.accept(10>39);
		
		Consumer<Character> c= firstName -> System.out.println(firstName);
		c.accept('c');
		
	}

}
