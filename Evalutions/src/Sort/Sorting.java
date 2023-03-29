package Sort;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorting {
	
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		
		list.add(89);
		list.add(43);
		list.add(78);
		list.add(2);
		list.add(4);
		System.out.println("Before the shoting " +  list);
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("This is the decending order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	

}
