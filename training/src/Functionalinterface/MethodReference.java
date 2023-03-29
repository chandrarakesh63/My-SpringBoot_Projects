package Functionalinterface;

import java.util.ArrayList;

public class MethodReference {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(12);
		arr.add(87);
		arr.add(56);
		arr.add(99);
		
//		arr.forEach((value) -> System.out.println(value));
		
		arr.forEach(System.out::println);
		
	}

}
