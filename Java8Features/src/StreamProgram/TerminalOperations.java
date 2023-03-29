package StreamProgram;

import java.util.ArrayList;
import java.util.List;

public class TerminalOperations {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(92);
		list.add(67);
		list.add(75);
		list.add(100);
		list.add(55);
		
		Integer integer=  list.stream().max(Integer::compareTo).get();
		
		Integer integer1= list.stream().min(Integer::compareTo).get();
		
		System.out.println(integer);
		System.out.println(integer1);

	}

}
