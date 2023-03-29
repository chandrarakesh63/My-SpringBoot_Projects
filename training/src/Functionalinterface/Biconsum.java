package Functionalinterface;

import java.util.function.BiConsumer;

public class Biconsum {
	public static void main(String[] args) {
		
	BiConsumer<Integer,	Integer> v1 = (value1,value2) -> System.out.println(value1 + value2);
	v1.accept(23,39);
}
}
