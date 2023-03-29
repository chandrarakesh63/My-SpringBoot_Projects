package Functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerProgram {

	public static void main(String[] args) {
		Consumer<Integer> arr = value -> System.out.println(value*6);
		
		arr.accept(32);
		
	}

}
