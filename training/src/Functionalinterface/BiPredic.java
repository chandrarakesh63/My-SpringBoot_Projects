package Functionalinterface;

import java.util.function.BiPredicate;

public class BiPredic {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> b= (value,value1) -> value > value1;
		System.out.println(b.test(12,20));
	}
}
