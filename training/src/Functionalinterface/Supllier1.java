package Functionalinterface;

import java.util.function.Supplier;

public class Supllier1 {
	public static void main(String[] args) {
		Supplier<Integer> s = () -> 12+78;
		
		System.out.println(s.get());
		
	}

}
